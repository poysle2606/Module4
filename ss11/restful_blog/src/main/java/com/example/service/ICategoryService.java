package com.example.service;

import com.example.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICategoryService {

    List<Category> findAll();

    void create(Category category);

    void edit(Category category);

    void delete(int id);

    Category findById(int id);

    List<Category> search(String name);
}
