package com.example.service;

import com.example.model.MyProduct;

import java.util.List;
import java.util.Optional;

public interface IProductService {

    List<MyProduct> findAll();

    Optional<MyProduct> findById(int id);

    void save(MyProduct product);

}
