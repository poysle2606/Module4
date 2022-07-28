package com.example.service;

import com.example.dto.ProductDto;
import com.example.model.MyProduct;
import com.example.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements IProductService{

    @Autowired
    IProductRepository iProductRepository;
    @Override
    public List<MyProduct> findAll() {
        return iProductRepository.findAll();
    }

    @Override
    public Optional<MyProduct> findById(int id) {
        return iProductRepository.findById(id);
    }

    @Override
    public void save(MyProduct product) {
        iProductRepository.save(product);
    }
}
