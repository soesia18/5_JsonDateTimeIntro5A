package at.htlkaindorf.jsondatetimeintro5a.database;

import at.htlkaindorf.jsondatetimeintro5a.pojo.MyObject;
import at.htlkaindorf.jsondatetimeintro5a.web.MyObjectRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.List;

/**
 * <h3>Created by IntelliJ IDEA.</h3><br>
 * <b>Project:</b> JsonDateTimeIntro5A<br>
 * <b>User:</b> Simon Schoeggler<br>
 * <b>Date:</b> 18. Jänner 2023<br>
 * <b>Time:</b> 08:24<br>
 */

@Component
public class DbInit {
    private final MyObjectRepository myObjectRepository;

    public DbInit(MyObjectRepository myObjectRepository) {
        this.myObjectRepository = myObjectRepository;
        test();
    }

    //@PostConstruct
    public void test () {
        /*MyObject myObject = new MyObject(1L, LocalDateTime.now());

        myObjectRepository.save(myObject);*/

        File file = Paths.get(System.getProperty("user.dir"), "src", "main", "resources", "times.json").toFile();

        ObjectMapper objectMapper = new ObjectMapper().findAndRegisterModules();

        //.registerModule(new JavaTimeModule())
        try {
            List<MyObject> myObjectList =
                    objectMapper.readValue(file, new TypeReference<List<MyObject>>() {});

            myObjectRepository.saveAll(myObjectList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
