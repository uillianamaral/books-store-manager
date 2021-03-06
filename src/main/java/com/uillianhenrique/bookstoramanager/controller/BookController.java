package com.uillianhenrique.bookstoramanager.controller;

import com.uillianhenrique.bookstoramanager.dto.BookDTO;
import com.uillianhenrique.bookstoramanager.dto.MessageResponseDTO;
import com.uillianhenrique.bookstoramanager.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public MessageResponseDTO create(@RequestBody @Valid BookDTO bookDTO){
        return bookService.create(bookDTO);
    }

}
