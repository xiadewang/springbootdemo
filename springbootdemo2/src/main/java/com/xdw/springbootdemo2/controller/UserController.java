package com.xdw.springbootdemo2.controller;

import com.xdw.springbootdemo2.model.Result;
import com.xdw.springbootdemo2.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @RequestMapping("/")
    public String index(){
        return "Hello World!";
    }

    @RequestMapping("/user")
    public Result<User> user(){
        Result<User> result = new Result<>();
        User user = new User();
        user.setId(1);
        user.setUsername("xiadewang");
        user.setPassword("123456");
        result.setCode(1);
        result.setMsg("succuss");
        result.setData(user);
        return result;
    }

    @RequestMapping("/users")
    public Result<List<User>> users(){
        Result<List<User>> result = new Result<>();
        List<User> userList = new ArrayList<>();
        User user = new User();
        user.setId(1);
        user.setUsername("xiadewang");
        user.setPassword("123456");
        userList.add(user);
        User user2 = new User();
        user2.setId(1);
        user2.setUsername("zhangsan");
        user2.setPassword("123456");
        userList.add(user2);
        result.setCode(1);
        result.setMsg("succuss");
        result.setData(userList);
        return result;
    }
}
