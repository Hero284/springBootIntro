package org.example.springBoot.service;

import java.util.List;
import org.example.springBoot.model.Book;

public interface BookService {
    Book save(Book book);

    List findAll();
}
