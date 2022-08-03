package com.codegym.service.customer;

import com.codegym.model.customer.Customer;
import com.codegym.model.customer.CustomerType;

import java.util.List;

public interface ICustomerTypeService {
    List<CustomerType> findAll();

    void editCustomerType(CustomerType customerType);

    CustomerType findById(int id);
}
