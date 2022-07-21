package com.codegym.service;

import com.codegym.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IProductService {
    Page<Product> findAll(Pageable pageable);

    void create(Product product);

    void edit(Product product);

    void delete(Integer id);

    Product findById(Integer id);

    List<Product> findName(String word);
}
