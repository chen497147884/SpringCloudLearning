package com.stargis.config;/**
 * Created by Chen.YH
 * 2018-04-13 17:03
 */

import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName FeignConfig
 * @Description TODO
 * @Author Chen.YH
 * @Date 2018-04-13 17:03
 * @Version 1.0
 **/
@Configuration
public class FeignConfig {
    @Bean
    public Retryer feignRetryer() {
        return new Retryer.Default(100, TimeUnit.SECONDS.toMillis(1), 5);
    }
}
