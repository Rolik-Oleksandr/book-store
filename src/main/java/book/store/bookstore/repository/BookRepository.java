package book.store.bookstore.repository;

import book.store.bookstore.model.Book;
import java.util.List;

public interface BookRepository {
    Book save(Book book);
    List findAll();
}
