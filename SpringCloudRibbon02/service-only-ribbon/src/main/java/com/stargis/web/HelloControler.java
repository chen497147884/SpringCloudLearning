package com.stargis.web;

import com.stargis.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by fangzhipeng on 2017/4/6.
 */
@RestController
public class HelloControler {
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloControler.class);

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    HelloService helloService;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        System.out.println(name);
//        return restTemplate.getForObject("http://helloworld/hi?name="+name,String.class);
        return helloService.hiService(name);
    }

    @GetMapping("/my-instance")
    public void logUserInstance() {
        ServiceInstance serviceInstance = this.loadBalancerClient.choose("helloworld");
        // 打印当前选择的是哪个节点
        HelloControler.LOGGER.info("{}:{}:{}", serviceInstance.getServiceId(), serviceInstance.getHost(), serviceInstance.getPort());
    }
}
