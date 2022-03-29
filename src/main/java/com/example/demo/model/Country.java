package com.example.demo.model;

public class Country {
    private Long id;
    private String name;
    private String continent;

    public Country(Long id,String name,String continent){
        this.id=id;
        this.name=name;
        this.continent=continent;
    }

    public Country(Long id) {
        this.id = id;
    }

    public Country(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContinent() {
        return continent;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }
}
