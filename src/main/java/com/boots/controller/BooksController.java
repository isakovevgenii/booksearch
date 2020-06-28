package com.boots.controller;

import com.boots.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BooksController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public String booksList(Model model) {
        model.addAttribute("allBooks", bookService.allBooks());
        return "books";
    }
}
