package com.uillianhenrique.bookstoramanager.service;

import com.uillianhenrique.bookstoramanager.dto.MassageResponseDTO;
import com.uillianhenrique.bookstoramanager.entity.Book;
import com.uillianhenrique.bookstoramanager.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @PostMapping
    public MassageResponseDTO create(Book book) {
        Book savedBook = bookRepository.save(book);
        return MassageResponseDTO.builder().message("Book created with ID " + savedBook.getId())
                .build();
    }
}
