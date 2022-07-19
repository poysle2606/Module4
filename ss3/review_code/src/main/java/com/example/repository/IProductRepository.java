package com.example.repository;

import com.example.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();

    Product findById(Integer id);

    List<Product> findByName(String name);

    void delete(Integer id);
}
