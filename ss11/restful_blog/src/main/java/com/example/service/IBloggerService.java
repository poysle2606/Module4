package com.example.service;

import com.example.model.Blogger;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBloggerService {
    List<Blogger> findAll();

    void create(Blogger blogger);

    void edit(Blogger blogger);

    void delete(int id);

    Blogger findById (int id);

    List<Blogger> search(String name);
}
