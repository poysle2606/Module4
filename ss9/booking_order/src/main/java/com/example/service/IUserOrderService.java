package com.example.service;

import com.example.model.Book;
import com.example.model.UserOrder;

import java.util.List;

public interface IUserOrderService {
    List<UserOrder> findAll();

    UserOrder findById(int id);

    void save(UserOrder userOrder);
}
