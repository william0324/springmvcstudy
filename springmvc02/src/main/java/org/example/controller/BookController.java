package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookController {
    @RequestMapping(value = "/books",method = RequestMethod.GET)
    @ResponseBody
    public String save() {

        return "{'module':'book'}";
    }

    @RequestMapping(value = "/books/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable Integer id) {
        System.out.println(id);
        return "{'module':'book delete'}";
    }

    @RequestMapping("/toPage")
    public String toPage() {
        System.out.println("跳转页面");
        return "index.jsp";
    }

}
