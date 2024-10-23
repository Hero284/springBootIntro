package org.example.springBoot.service.Impl;

import java.util.List;
import org.example.springBoot.model.Book;
import org.example.springBoot.repository.BookRepository;
import org.example.springBoot.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List findAll() {
        return bookRepository.findAll();
    }
}
