package com.example.service;

import com.example.model.UserOrder;
import com.example.repository.IUserOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserOrderService{

    @Autowired
    IUserOrderRepository iUserOrderRepository;

    @Override
    public List<UserOrder> findAll() {
        return iUserOrderRepository.findAll();
    }

    @Override
    public UserOrder findById(int id) {
        return iUserOrderRepository.findById(id).orElse(null);
    }

    @Override
    public void save(UserOrder userOrder) {
        long code = (long) (Math.random() * (99999 - 10000) + 10000);
        userOrder.setCode(code);
        iUserOrderRepository.save(userOrder);
    }
}
