package com.boots.service;

import com.boots.entity.Book;
import com.boots.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public List<Book> allBooks() {
        return bookRepository.findAll();
    }

    public Book findBookById(Long bookId) {
        Optional<Book> book = bookRepository.findById(bookId);
        return book.orElse(null);
    }
}
