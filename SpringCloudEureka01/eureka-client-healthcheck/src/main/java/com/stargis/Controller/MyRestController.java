package com.stargis.Controller;/**
 * Created by Chen.YH
 * 2018-04-11 21:25
 */

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName MyRestController
 * @Description TODO
 * @Author Chen.YH
 * @Date 2018-04-11 21:25
 * @Version 1.0
 **/
@RestController
public class MyRestController {

    public static boolean isDB = true;

    @GetMapping(value = "/setIsDB/{isDB}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void setIsDB(@PathVariable boolean isDB) {
        this.isDB = isDB;
    }

}
