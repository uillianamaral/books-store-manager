package com.uillianhenrique.bookstoramanager.service;

import com.uillianhenrique.bookstoramanager.dto.BookDTO;
import com.uillianhenrique.bookstoramanager.dto.MessageResponseDTO;
import com.uillianhenrique.bookstoramanager.entity.Book;
import com.uillianhenrique.bookstoramanager.mapper.BookMapper;
import com.uillianhenrique.bookstoramanager.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private BookRepository bookRepository;
    private final BookMapper bookMapper = BookMapper.INSTANCE;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public MessageResponseDTO create(BookDTO bookDTO) {
        Book bookToSave = bookMapper.toModel(bookDTO);

        Book bookSaved = this.bookRepository.save(bookToSave);

        return MessageResponseDTO.builder()
                .message("Book created with ID: " + bookSaved.getId())
                .build();
    }
}
