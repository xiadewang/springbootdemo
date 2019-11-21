package com.xdw.springbootdemo2.controller;

import com.xdw.springbootdemo2.model.Result;
import com.xdw.springbootdemo2.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ViewAndRestController {
    @RequestMapping("/myview")
    public String myview(){
        System.out.println("myview");
        return "static/view1.html";
    }

    @RequestMapping("/user2")
    @ResponseBody
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
}
