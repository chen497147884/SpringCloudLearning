package com.stargis.hystric;/**
 * Created by Chen.YH
 * 2018-04-15 15:04
 */

import com.stargis.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @ClassName SchedualServiceHiHystric
 * @Description TODO
 * @Author Chen.YH
 * @Date 2018-04-15 15:04
 * @Version 1.0
 **/
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}