package com.boots.controller;

import com.boots.entity.Book;
import com.boots.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BooksController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookService.allBooks();
    }

    @GetMapping("/books/{bookId}")
    public Book getBookByBookId(@PathVariable(required = false) Long bookId) {
        return bookService.findBookById(bookId);
    }
}
