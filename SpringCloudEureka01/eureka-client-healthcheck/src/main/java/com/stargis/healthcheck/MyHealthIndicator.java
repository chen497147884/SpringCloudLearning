package com.stargis.healthcheck;/**
 * Created by Chen.YH
 * 2018-04-11 21:24
 */

import com.stargis.Controller.MyRestController;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.actuate.health.Status;
import org.springframework.stereotype.Component;

/**
 * @ClassName MyHealthIndicator
 * @Description 自定义健康指示器
 * @Author Chen.YH
 * @Date 2018-04-11 21:24
 * @Version 1.0
 **/
@Component
public class MyHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        if(MyRestController.isDB){
            return new Health.Builder(Status.UP).build();
        } else{
            return new Health.Builder(Status.DOWN).build();
        }
    }
}