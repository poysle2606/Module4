package com.codegym.service;

import com.codegym.model.Blogger;
import com.codegym.repository.IBloggerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BloggerServiceImpl implements IBloggerService{

    @Autowired
    IBloggerRepository iBloggerRepository;

    @Override
    public Page<Blogger> findAll(Pageable pageable) {
        return iBloggerRepository.findAll(pageable);
    }

    @Override
    public void create(Blogger blogger) {
        iBloggerRepository.save(blogger);
    }

    @Override
    public void edit(Blogger blogger) {
        iBloggerRepository.update(blogger.getContent(), blogger.getName(), blogger.getStatus(),blogger.getDayStart(), blogger.getId());
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

    @Override
    public Page<Blogger> search(Pageable pageable, String name) {
        return iBloggerRepository.searchByName(pageable,"%" + name + "%");
    }

}
