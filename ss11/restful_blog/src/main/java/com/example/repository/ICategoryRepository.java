package com.example.repository;

import com.example.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface ICategoryRepository extends JpaRepository<Category, Integer> {

    @Modifying
    @Query(value = "update Category set name=:name where id=:id", nativeQuery = true)
    void update(@Param("name") String name, @Param("id") int id);

    @Query(value = "select * from Category where name like :search", nativeQuery = true)
    List<Category> findByName(@Param("search") String name);
}
