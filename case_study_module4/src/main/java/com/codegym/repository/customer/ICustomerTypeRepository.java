package com.codegym.repository.customer;

import com.codegym.model.customer.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

@Transactional
public interface ICustomerTypeRepository extends JpaRepository<CustomerType,Integer> {

    @Modifying
    @Query(value = "update customer_type set name=:name where id=:id",nativeQuery = true)
    void updateCustomerType(@Param("name") String name, @Param("id") int id);
}
