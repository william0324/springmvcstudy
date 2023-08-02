package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DataSubmitAction {
    @RequestMapping("/one.action")
    public String one(String name , Integer age) {
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        return "main";
    }

    @RequestMapping("/two.action")
    public String two(User user) {
        System.out.println(user);
        return "main";
    }
}
