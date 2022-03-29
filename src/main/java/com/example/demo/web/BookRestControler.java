package com.example.demo.example1.web;

import com.example.demo.model.Books;
import com.example.demo.service.BooksService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
@RequestMapping("/api/books")
public class BookRestControler {
    private BooksService booksService;

    public BookRestController() {}

    public BookRestController(BooksService booksService){
        this.booksService = booksService;
    }

    @GetMapping
    public List<Books> findAll(){
        return this.booksService.findAll();
    }


    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        this.booksService.deleteById(id);
    }

}
