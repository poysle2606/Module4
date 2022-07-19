package com.example.service;

import com.example.model.Product;
import com.example.repository.IProductRepository;
import com.example.repository.ProductRepository;

import java.util.List;

public class ProductService implements IProductService {

    IProductRepository iProductRepository = new ProductRepository();

    @Override
    public List<Product> findAll() {
        return iProductRepository.findAll();
    }

    @Override
    public Product findById(Integer id) {
        return iProductRepository.findById(id);
    }

    @Override
    public List<Product> findByName(String name) {
        return iProductRepository.findByName(name);
    }

    @Override
    public void delete(Integer id) {
        iProductRepository.delete(id);
    }
}
