package com.example.repository;

import com.example.model.MobilePhone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPhoneRepository extends JpaRepository<MobilePhone, Integer> {
}
