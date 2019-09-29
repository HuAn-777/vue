package com.itstar;

import com.itstar.pojo.User;
import com.itstar.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VueApplicationTests {
    @Autowired
    private UserService userService;

    @Test
    public void contextLoads() {

        List<User> byAll = userService.findByAll();

        System.out.println(byAll);
    }

}
