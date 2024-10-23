package spring.repository;

import java.util.List;
import spring.model.Book;

public interface BookRepository {
    Book save(Book book);

    List findAll();
}
