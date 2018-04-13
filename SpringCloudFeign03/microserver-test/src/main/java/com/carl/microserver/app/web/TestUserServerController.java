package com.carl.microserver.app.web;

import com.carl.microserver.app.service.TestUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Date: 2018/4/13 9:31
 * @Author: Carl
 */
@RestController
@ResponseStatus(HttpStatus.OK)
public class TestUserServerController {

    @Autowired
    private TestUserService testUserService;

    @GetMapping("/find")
    public List<String> findUser(){
        return testUserService.findUser();
    }
}
