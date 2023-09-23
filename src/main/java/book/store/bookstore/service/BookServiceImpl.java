package book.store.bookstore.service;

import book.store.bookstore.dto.BookResponseDto;
import book.store.bookstore.dto.CreateBookRequestDto;
import book.store.bookstore.exception.EntityNotFoundException;
import book.store.bookstore.mapper.BookMapper;
import book.store.bookstore.model.Book;
import book.store.bookstore.repository.BookRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    @Override
    public BookResponseDto save(CreateBookRequestDto requestBookDto) {
        Book book = bookMapper.toModel(requestBookDto);
        return bookMapper.toDto(bookRepository.save(book));
    }

    @Override
    public BookResponseDto getBookById(Long id) {
        return bookMapper.toDto(bookRepository.findById(id).orElseThrow(() ->
                new EntityNotFoundException("couldn't find book by id: " + id)));
    }

    @Override
    public List<BookResponseDto> findAll() {
        return bookRepository.findAll()
                .stream()
                .map(bookMapper::toDto)
                .toList();
    }
}
