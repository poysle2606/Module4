package com.example.model;

public class Product {
    private Integer id;
    private String name;
    private double price;
    private String description;
    private String production;

    public Product() {
    }

    public Product(Integer id, String name, double price, String description, String production) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.production = production;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }
}
