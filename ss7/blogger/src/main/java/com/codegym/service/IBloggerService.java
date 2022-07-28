package com.codegym.service;

import com.codegym.model.Blogger;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface    IBloggerService {
    Page<Blogger> findAll(Pageable pageable);

    void create(Blogger blogger);

    void edit(Blogger blogger);

    void delete(int id);

    Blogger findById (int id);

    Page<Blogger> search(Pageable pageable,String name);

}
