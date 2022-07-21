package com.codegym.service;

import com.codegym.model.Product;
import com.codegym.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService{

    @Autowired
    IProductRepository iProductRepository;

    @Override
    public Page<Product> findAll(Pageable pageable) {
        return iProductRepository.findAll(pageable);
    }

    @Override
    public void create(Product product) {
        iProductRepository.save(product);
    }

    @Override
    public void edit(Product product) {
        iProductRepository.update(product.getName(), product.getPrice(), product.getProduction(), product.getId());
    }

    @Override
    public void delete(Integer id) {
        Product product = findById(id);
        iProductRepository.delete(product);
    }

    @Override
    public Product findById(Integer id) {
        return iProductRepository.findById(id).orElse(null);
    }

    @Override
    public List<Product> findName(String word) {
        return iProductRepository.searchByName("%" + word + "%");
    }
}
