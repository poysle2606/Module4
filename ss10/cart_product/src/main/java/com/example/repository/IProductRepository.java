package com.example.repository;

import com.example.model.MyProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<MyProduct, Integer> {
}
