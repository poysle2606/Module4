package com.example.service;

import com.example.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    Product findById(Integer id);

    List<Product> findByName(String name);

    void delete(Integer id);
}
