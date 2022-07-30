package com.example.service;

import com.example.model.MobilePhone;

import java.util.List;

public interface IPhoneService {
    List<MobilePhone> findAll();

    MobilePhone findById(Integer id);

    MobilePhone save(MobilePhone mobilePhone);

    void remove(Integer id);
}
