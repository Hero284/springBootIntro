package spring.service;

import java.util.List;
import spring.model.Book;

public interface BookService {
    Book save(Book book);

    List findAll();
}
