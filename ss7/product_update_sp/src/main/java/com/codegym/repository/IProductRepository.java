package com.codegym.repository;

import com.codegym.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface IProductRepository extends JpaRepository<Product, Integer> {

    @Modifying
    @Query(value = "update Product set name=:name, price=:price, production=:production where id=:id", nativeQuery = true)
    void update(@Param("name") String name, @Param("price") double price,@Param("production") String production, @Param("id") int id);

    @Modifying
    @Query(value = "select * from Product where name like :word",nativeQuery = true)
    List<Product> searchByName(@Param("word") String word);
}
