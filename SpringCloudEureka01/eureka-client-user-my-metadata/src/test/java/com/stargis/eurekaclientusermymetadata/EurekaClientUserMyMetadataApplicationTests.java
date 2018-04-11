package com.stargis.eurekaclientusermymetadata;

import com.stargis.entity.User;
import com.stargis.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EurekaClientUserMyMetadataApplicationTests {
    @Autowired
    private UserRepository repository;
    @Test
    public void contextLoads() {
        Optional<User> u = repository.findById(1L);
        System.out.println(u.get().getAge());
//        Assert.assertEquals("成功的测试用例", "张三", u.getName());
    }

}
