package com.xdw.springbootdemo4.controller;

import com.xdw.springbootdemo4.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;


@Controller
public class UserController {

    /**
     * 采用model往request域中存值，存入2个普通的字符串
     * @param model
     * @return
     */
    @RequestMapping(value = "/userinfo1",method = RequestMethod.GET)
    public String userinfo1(Model model) {
        String username = "xiadewang";
        String password = "123456";
        model.addAttribute("username", username);
        model.addAttribute("password", password);
        return "userinfo1";
    }

    /**
     * 采用model往request域中存值，存入一个user对象数据
     * @param model
     * @return
     */
    @RequestMapping(value = "/userinfo2",method = RequestMethod.GET)
    public String userinfo2(Model model) {
        User user =new User();
        user.setUsername("xiadewang");
        user.setPassword("123456");
        model.addAttribute("user",user);
        return "userinfo2";
    }

    /**
     * 采用model往request域中存值，存入一个user集合数据
     * @param model
     * @return
     */
    @RequestMapping(value = "/userinfo3",method = RequestMethod.GET)
    public String userinfo3(Model model) {
        List<User> userList =new ArrayList<>();
        User user1 =new User();
        user1.setId(1);
        user1.setUsername("xiadewang");
        user1.setPassword("123456");
        User user2 =new User();
        user2.setId(2);
        user2.setUsername("zhangsan");
        user2.setPassword("111111");
        User user3 =new User();
        user3.setId(3);
        user3.setUsername("zhangsan");
        user3.setPassword("222222");
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        model.addAttribute("users",userList);
        return "userinfo3";
    }
}
