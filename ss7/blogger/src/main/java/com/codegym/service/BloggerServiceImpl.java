package com.example.blogger.service;

import com.example.blogger.model.Blogger;
import com.example.blogger.repository.IBloggerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BloggerServiceImpl implements IBloggerService{

    @Autowired
    IBloggerRepository iBloggerRepository;

    @Override
    public List<Blogger> findAll() {
        return iBloggerRepository.findAll();
    }

    @Override
    public void create(Blogger blogger) {
        iBloggerRepository.save(blogger);
    }

    @Override
    public void edit(Blogger blogger) {
        iBloggerRepository.update(blogger.getContent(), blogger.getName(), blogger.getStatus(), blogger.getId());
    }

    @Override
    public void delete(int id) {
        Blogger blogger = findById(id);
        iBloggerRepository.delete(blogger);
    }

    @Override
    public Blogger findById(int id) {
        return iBloggerRepository.findById(id).orElse(null);
    }

}
