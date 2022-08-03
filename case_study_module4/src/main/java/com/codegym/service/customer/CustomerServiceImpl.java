package com.codegym.service.customer;

import com.codegym.model.customer.Customer;
import com.codegym.repository.customer.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    ICustomerRepository iCustomerRepository;

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return iCustomerRepository.findAll(pageable);
    }

    @Override
    public void create(Customer customer) {
        iCustomerRepository.save(customer);
    }

    @Override
    public void update(Customer customer) {
//        iCustomerRepository.editCustomer(customer.getNameCustomer(),
//                customer.getDayOfBirth(), customer.getGender(), customer.getIdCard(),
//                customer.getNumberPhone(), customer.getEmail(), customer.getAddress(), customer.getIdCustomer());
        iCustomerRepository.save(customer);
    }

    @Override
    public void delete(int id) {
        iCustomerRepository.deleteById(id);
    }

    @Override
    public Customer findById(int id) {
        return iCustomerRepository.findById(id).orElse(null);
    }

    @Override
    public Page<Customer> findByName(Pageable pageable,String name) {
        return iCustomerRepository.searchByName(pageable,"%" + name + "%");
    }
}
