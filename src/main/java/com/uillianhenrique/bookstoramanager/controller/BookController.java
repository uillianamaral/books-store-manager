package com.uillianhenrique.bookstoramanager.controller;

import com.uillianhenrique.bookstoramanager.dto.MassageResponseDTO;
import com.uillianhenrique.bookstoramanager.entity.Book;
import com.uillianhenrique.bookstoramanager.repository.BookRepository;
import com.uillianhenrique.bookstoramanager.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public MassageResponseDTO create(@RequestBody Book book) {
        return bookService.create(book);
    }
}
