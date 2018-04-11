package com.stargis.healthcheck;/**
 * Created by Chen.YH
 * 2018-04-11 21:21
 */

import com.netflix.appinfo.HealthCheckHandler;
import com.netflix.appinfo.InstanceInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Status;

/**
 * @ClassName MyHealthCheckHandler
 * @Description TODO
 * @Author Chen.YH
 * @Date 2018-04-11 21:21
 * @Version 1.0
 **/
public class MyHealthCheckHandler implements HealthCheckHandler {

    @Autowired
    private MyHealthIndicator  myHealthIndicator;

    @Override
    public InstanceInfo.InstanceStatus getStatus(InstanceInfo.InstanceStatus instanceStatus) {
        Status status = myHealthIndicator.health().getStatus();
        if (status.equals(Status.UP)){
            return InstanceInfo.InstanceStatus.UP;
        } else {
            return InstanceInfo.InstanceStatus.DOWN;
        }
    }
}
