package com.codegym.service.customer;

import com.codegym.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICustomerService {

    Page<Customer> findAll(Pageable pageable);

    void create(Customer customer);

    void update(Customer customer);

    void delete(int id);

    Customer findById(int id);

    Page<Customer> findByName(Pageable pageable,String name);
}
