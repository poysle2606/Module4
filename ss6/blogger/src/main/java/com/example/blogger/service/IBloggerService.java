package com.example.blogger.service;

import com.example.blogger.model.Blogger;

import java.util.List;

public interface IBloggerService {
    List<Blogger> findAll();

    void create(Blogger blogger);

    void edit(Blogger blogger);

    void delete(int id);

    Blogger findById (int id);

}
