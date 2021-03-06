package com.uillianhenrique.bookstoramanager.mapper;

import com.uillianhenrique.bookstoramanager.dto.BookDTO;
import com.uillianhenrique.bookstoramanager.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    Book toModel(BookDTO bookDTO);

    BookDTO toDTO(Book book);

}