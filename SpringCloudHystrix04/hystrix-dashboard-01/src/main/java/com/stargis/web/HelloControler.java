package com.stargis.web;

import com.stargis.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fangzhipeng on 2017/4/6.
 */
@RestController
public class    HelloControler {



    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/sayhi")
    public String hi(@RequestParam String name){
        System.out.println("This is ribbon-service that it is name:" + name);
        return helloService.hiService(name);
    }


}
