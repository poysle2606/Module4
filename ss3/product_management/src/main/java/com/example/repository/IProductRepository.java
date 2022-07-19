package com.example.repository;

import com.example.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();

    void create(Product product);

    void edit(Product product, Integer id);

    void delete(Integer id);

    Product findById(Integer id);

    Product findName(String name);

}
