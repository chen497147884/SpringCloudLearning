package com.stargis.controller;/**
 * Created by Chen.YH
 * 2018-04-11 15:35
 */

import com.stargis.entity.User;
import com.stargis.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


/**
 * @ClassName MovieController
 * @Description MovieCpntroller
 * @Author Chen.YH
 * @Date 2018-04-11 15:35
 * @Version 1.0
 **/
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        Optional<User> user = this.userRepository.findById(id);
        return user.get();
    }
}
