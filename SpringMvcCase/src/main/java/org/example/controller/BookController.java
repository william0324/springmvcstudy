package org.example.controller;

import org.example.pojo.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @PostMapping
    public String save(@RequestBody Book book) {
        System.out.println(book);
        return "{book save success}";
    }
    @GetMapping
    public List<Book> getAll() {
        System.out.println("book getAll is running ...");
        List<Book> bookList = new ArrayList<Book>();

        Book book1 = new Book();
        book1.setType("计算机");
        book1.setName("SpringMVC入门教程");
        book1.setDescription("小试牛刀");
        bookList.add(book1);

        Book book2 = new Book();
        book2.setType("计算机");
        book2.setName("SpringMVC实战教程");
        book2.setDescription("进阶");
        bookList.add(book2);
        return bookList;
    }
}
