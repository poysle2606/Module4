package com.example.service;

import com.example.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    void create(Product product);

    void edit(Product product, Integer id);

    void delete(Integer id);

    Product findById(Integer id);

    Product findName();
}
