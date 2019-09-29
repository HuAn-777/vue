package com.itstar.controller;

import com.itstar.pojo.User;
import com.itstar.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/vuejsDemo/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/findAll.do")
    @ResponseBody
    public List<User> findall(){

        List<User> byAll = userService.findByAll();

        return byAll;

    }

    @RequestMapping("/findById.do")
    @ResponseBody
    public User findById(int id){

        User byId = userService.findById(id);

        return byId;

    }

    @RequestMapping("/update.do")

    public String update(@RequestBody User user){

        userService.updateBy(user);

        return "forward:/vuejsDemo/user/findAll.do";


    }


}
