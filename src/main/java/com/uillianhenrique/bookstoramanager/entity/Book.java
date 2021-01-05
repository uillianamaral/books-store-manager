package com.uillianhenrique.bookstoramanager.entity;

import javax.persistence.*;

@Entity(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "pages", nullable = false)
    private Integer pages;

    @Column(name = "chapters", nullable = false)
    private Integer chapters;

    @Column(name = "isbn", nullable = false)
    private String isbn;

    @Column(name = "publisher_name", nullable = false, unique = false)
    private String publisherName;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JoinColumn(name = "author_id")
    private Author author;
}
