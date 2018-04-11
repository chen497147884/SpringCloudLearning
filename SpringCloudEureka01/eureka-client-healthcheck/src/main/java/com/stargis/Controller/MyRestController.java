package com.stargis.Controller;/**
 * Created by Chen.YH
 * 2018-04-11 21:25
 */

import com.netflix.appinfo.InstanceInfo;
import com.stargis.healthcheck.MyHealthCheckHandler;
import org.springframework.boot.actuate.health.Status;
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
    public boolean setIsDB(@PathVariable boolean isDB) {
        this.isDB = isDB;
//        MyHealthCheckHandler myHealthCheckHandler = new MyHealthCheckHandler();
//        if (isDB) {
//            myHealthCheckHandler.getStatus(InstanceInfo.InstanceStatus.UP);
//        }else{
//            myHealthCheckHandler.getStatus(InstanceInfo.InstanceStatus.DOWN);
//        }
        return isDB;
    }

}
