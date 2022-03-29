package com.example.demo.example1.service;

import com.example.demo.zadaca1.model.*;
import com.example.demo.model.Books;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BooksService {
    List<Books>findAll();
    List<Books>findById(Long id);
    List<Books>edit(Long id, String name, Books.category categ, Author author, Integer avaliableCopies);
    void deleteById(Long id);


    Books save(Books book);

    Books update(Long id, Books book);
}
