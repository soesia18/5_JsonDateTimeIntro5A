package at.htlkaindorf.jsondatetimeintro5a.web;

import at.htlkaindorf.jsondatetimeintro5a.pojo.MyObject;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * <h3>Created by IntelliJ IDEA.</h3><br>
 * <b>Project:</b> JsonDateTimeIntro5A<br>
 * <b>User:</b> Simon Schoeggler<br>
 * <b>Date:</b> 18. Jänner 2023<br>
 * <b>Time:</b> 08:23<br>
 */

public interface MyObjectRepository extends JpaRepository<MyObject, Long> {
}
