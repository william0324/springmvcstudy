package org.example.controller;

import org.example.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/save")
    @ResponseBody
    public String save() {

        return "{'module':'user save'}";
    }
    @RequestMapping("/delete")
    @ResponseBody
    public String delete() {

        return "{'module':'user delete'}";
    }
    @RequestMapping("/commonParam")
    @ResponseBody
    public String commonParam(String name,int age) {
        System.out.println("普通参数传递 name = " + name);
        System.out.println("普通参数传递 age = " + age);
        return "{'module':'user commonParam'}";
    }
    @RequestMapping("/commonParamDifferentName")
    @ResponseBody
    public String commonParamDifferentName(@RequestParam("name") String userName, @RequestParam("age") int age) {
        System.out.println("普通参数传递 name = " + userName);
        System.out.println("普通参数传递 age = " + age);
        return "{'module':'user commonParamDifferentName'}";
    }
    @RequestMapping("/pojoParam")
    @ResponseBody
    public String pojoParam(User user) {
        System.out.println(user);
        return "{'module':'user pojoParam'}";
    }
    @RequestMapping("/listParamForJson")
    @ResponseBody
    public String listParamForJson(@RequestBody List<String> likes) {
        System.out.println(likes);
        return "{'module':'user listParamForJson'}";
    }
    @RequestMapping("/pojoParamForJson")
    @ResponseBody
    public String pojoParamForJson(@RequestBody User user) {
        System.out.println(user);
        return "{'module':'user pojoParamForJson'}";
    }
    @RequestMapping("/dateParam")
    @ResponseBody
    public String dateParam(Date date, @DateTimeFormat(pattern = "yyyy-MM-dd") Date date1) {
        System.out.println(date);
        System.out.println(date1);
        return "{'module':'user dateParam'}";
    }
    @RequestMapping("/toText")
    @ResponseBody
    public String toText() {
        System.out.println("toText");
        return "response text";
    }
    @RequestMapping("/toJsonPojo")
    @ResponseBody
    public User toJsonPojo() {
        System.out.println("toJsonPojo");
        User user = new User();
        user.setName("li");
        user.setAge(25);
        return user;
    }

}
