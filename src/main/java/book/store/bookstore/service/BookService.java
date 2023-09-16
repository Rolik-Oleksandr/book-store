package book.store.bookstore.service;

import book.store.bookstore.model.Book;
import java.util.List;

public interface BookService {
    Book save(Book book);

    List<Book> findAll();
}
