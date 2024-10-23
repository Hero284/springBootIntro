package org.example.springBoot.repository;

import java.util.List;
import org.example.springBoot.model.Book;

public interface BookRepository {
    Book save(Book book);

    List findAll();
}
