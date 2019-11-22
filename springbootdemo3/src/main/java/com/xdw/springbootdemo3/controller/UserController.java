package com.xdw.springbootdemo3.controller;

import com.xdw.springbootdemo3.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class UserController {
    /**
     * 1.直接把请求参数写在Controller相应的方法的形参中
     * @param username
     * @param password
     * @return
     */
    @RequestMapping("/addUser1")
    public String addUser1(String username,String password) {
        System.out.println("username is:"+username);
        System.out.println("password is:"+password);
        return "success";
    }

    /**
     * 2、封装一个bean来接收
     * @param user
     * @return
     */
    @RequestMapping("/addUser2")
    public String addUser2(User user) {
        System.out.println("id is:"+user.getId());
        System.out.println("username is:"+user.getUsername());
        System.out.println("password is:"+user.getPassword());
        return "success";
    }

    /**
     * 3、通过原生的HttpServletRequest接收
     * @param request
     * @return
     */
    @RequestMapping("/addUser3")
    public String addUser3(HttpServletRequest request) {
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        System.out.println("username is:"+username);
        System.out.println("password is:"+password);
        return "success";
    }

    /**
     * 4、通过@PathVariable获取rest风格请求路径中的参数
     * @param username
     * @param password
     * @return
     */
    @RequestMapping(value="/addUser4/{username}/{password}")
    public String addUser4(@PathVariable String username, @PathVariable String password) {
        System.out.println("username is:"+username);
        System.out.println("password is:"+password);
        return "success";
    }

    /**
     * 5、使用@ModelAttribute注解请求参数
     * @param user
     * @return
     */
    @RequestMapping(value="/addUser5")
    public String addUser5(@ModelAttribute("user") User user) {
        System.out.println("id is:"+user.getId());
        System.out.println("username is:"+user.getUsername());
        System.out.println("password is:"+user.getPassword());
        return "success";
    }

    /**
     * 6、使用注解@RequestParam绑定请求参数到方法形参
     * @param username
     * @param password
     * @return
     */
    @RequestMapping(value="/addUser6")
    public String addUser6(@RequestParam("username") String username, @RequestParam("password") String password) {
        System.out.println("username is:"+username);
        System.out.println("password is:"+password);
        return "success";
    }

    /**
     * 7、用注解@Requestbody绑定请求参数到方法入参
     * @param user
     * @return
     */
    @RequestMapping(value="/addUser7")
    public String addUser7(@RequestBody User user) {
        System.out.println("id is:"+user.getId());
        System.out.println("username is:"+user.getUsername());
        System.out.println("password is:"+user.getPassword());
        return "success";
    }

    /**
     * @Requestbody和@RequestParam同时使用
     * @param user
     * @param token
     * @return
     */
    @RequestMapping(value="/addUser8")
    public String addUser8(@RequestBody User user,@RequestParam("token") String token) {
        System.out.println("token is:"+token);
        System.out.println("id is:"+user.getId());
        System.out.println("username is:"+user.getUsername());
        System.out.println("password is:"+user.getPassword());
        return "success";
    }
}
