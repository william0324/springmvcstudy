package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemAction {
    @RequestMapping("/demo.action")
    public String demo() {
        System.out.println("服务器北方闻到了......");
        return "main";
    }
}
