package com.carl.microserver.app.service;

import com.carl.microserver.app.service.remote.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Date: 2018/4/13 9:44
 * @Author: Carl
 */
@Service
public class TestUserService {

    @Autowired
    private UserService userService;

    public List<String> findUser(){
        return  userService.findUser();
    }
}
