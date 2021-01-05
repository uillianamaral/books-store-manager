package com.uillianhenrique.bookstoramanager.repository;

import com.uillianhenrique.bookstoramanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
