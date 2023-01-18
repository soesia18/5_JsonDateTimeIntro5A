package at.htlkaindorf.jsondatetimeintro5a.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * <h3>Created by IntelliJ IDEA.</h3><br>
 * <b>Project:</b> JsonDateTimeIntro5A<br>
 * <b>User:</b> Simon Schoeggler<br>
 * <b>Date:</b> 18. Jänner 2023<br>
 * <b>Time:</b> 08:21<br>
 */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyObject {
    @Id
    private Long id;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    @Column(columnDefinition = "DATE")
    private LocalDateTime dateTime;
}
