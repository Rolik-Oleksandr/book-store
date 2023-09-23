package book.store.bookstore.service;

import book.store.bookstore.dto.BookResponseDto;
import book.store.bookstore.dto.CreateBookRequestDto;
import java.util.List;

public interface BookService {
    BookResponseDto save(CreateBookRequestDto requestBookDto);

    BookResponseDto getBookById(Long id);

    List<BookResponseDto> findAll();
}
