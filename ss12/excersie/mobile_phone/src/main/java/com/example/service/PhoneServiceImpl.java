package com.example.service;

import com.example.model.MobilePhone;
import com.example.repository.IPhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class PhoneServiceImpl implements IPhoneService{

    @Autowired
    IPhoneRepository iPhoneRepository;
    @Override
    public List<MobilePhone> findAll() {
        return iPhoneRepository.findAll();
    }

    @Override
    public MobilePhone findById(Integer id) {
        return iPhoneRepository.findById(id).orElse(null);
    }

    @Override
    public MobilePhone save(MobilePhone mobilePhone) {
        return iPhoneRepository.save(mobilePhone);
    }

    @Override
    public void remove(Integer id) {
        iPhoneRepository.deleteAllById(Collections.singleton(id));
    }
}
