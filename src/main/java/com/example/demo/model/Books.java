package com.example.demo.model;


import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Books")
public class Books {
    @Id
    private Long id;
    @NotNull
    private String name;
    public enum category{
        NOVEL,
        THRILER,
        HISTORY,
        FANTASY,
        BIOGRAPHY,
        CLASSICS,
        DRAMA
    };
    public category getCateg() {
        return categ;
    }

    public Integer getAvaliableCopies() {
        return avaliableCopies;
    }

    public Author getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCateg(category categ) {
        this.categ = categ;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setAvaliableCopies(Integer avaliableCopies) {
        this.avaliableCopies = avaliableCopies;
    }

    public Books(Long id) {
        this.id = id;
    }

    public Books(String name) {
        this.name = name;
    }
    public Books(Author author) {
        this.author = author;
    }

    public Books(category categ) {
        this.categ = categ;
    }

    public Books(Integer avaliableCopies) {
        this.avaliableCopies = avaliableCopies;
    }

    public category categ;
    private transient Author author;
    private Integer avaliableCopies;

    public Books(){}

    public Books(Long id, String name, category categ,Author author, Integer avaliableCopies){
        this.id=id;
        this.name=name;
        this.categ=categ;
        this.author=author;
        this.avaliableCopies=avaliableCopies;
    }
}
