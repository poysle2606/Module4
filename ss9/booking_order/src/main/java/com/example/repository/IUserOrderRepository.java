package com.example.repository;

import com.example.model.UserOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserOrderRepository extends JpaRepository<UserOrder,Integer> {
}
