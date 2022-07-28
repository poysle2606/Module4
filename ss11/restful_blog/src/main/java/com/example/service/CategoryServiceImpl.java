package com.example.service;

import com.example.model.Category;
import com.example.repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements ICategoryService{

    @Autowired
    ICategoryRepository iCategoryRepository;

    @Override
    public List<Category> findAll() {
        return iCategoryRepository.findAll();
    }

    @Override
    public void create(Category category) {
        iCategoryRepository.save(category);
    }

    @Override
    public void edit(Category category) {
        iCategoryRepository.update(category.getName(), category.getId());
    }

    @Override
    public void delete(int id) {
        Category category = findById(id);
        iCategoryRepository.delete(category);
    }

    @Override
    public Category findById(int id) {
        return iCategoryRepository.findById(id).orElse(null);
    }

    @Override
    public List<Category> search(String name) {
        return iCategoryRepository.findByName("%" + name + "%");
    }
}
