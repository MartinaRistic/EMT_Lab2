package com.example.demo.example1.web;

import com.example.demo.model.Books;
import com.example.demo.service.BooksService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BooksController {
    private BooksService booksService;


    public BooksController() {}

    public BooksController(BooksService booksService) {
        this.booksService = booksService;

    }

    @GetMapping
    public String getBooksPage(Model model){
        List<Books> books = this.booksService.findAll();
        model.addAttribute("books", books);
        return "books";
    }

    @GetMapping("/add-new")
    public String addNewBook(Model model){
        List<Books> category = this.booksService.findAll();
        model.addAttribute("category", category);
        model.addAttribute("books", new Books());
        return "add-book";
    }

    @GetMapping("/books/{id}/edit")
    public String editBookPage(@PathVariable Long id, Model model){
        try{
            Books book = (Books) this.booksService.findById(id);
            List<Books> category = this.booksService.findAll();
            model.addAttribute("category", category);
            model.addAttribute("book", book);
            return "add-book";
        }catch (RuntimeException ex){
            return "redirect:/books?error=" + ex.getMessage();
        }
    }
    @DeleteMapping("/{id}/delete")
    public String deleteBook(@PathVariable Long id){
        this.booksService.deleteById(id);
        return "redirect:/books";
    }
}
