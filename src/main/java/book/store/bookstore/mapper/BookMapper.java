package book.store.bookstore.mapper;

import book.store.bookstore.config.MapperConfig;
import book.store.bookstore.dto.BookResponseDto;
import book.store.bookstore.dto.CreateBookRequestDto;
import book.store.bookstore.model.Book;
import org.mapstruct.Mapper;

@Mapper(config = MapperConfig.class)
public interface BookMapper {
    BookResponseDto toDto(Book book);

    Book toModel(CreateBookRequestDto requestDto);
}
