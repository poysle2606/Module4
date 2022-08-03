package com.codegym.repository.customer;

import com.codegym.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

@Transactional
public interface ICustomerRepository extends JpaRepository<Customer, Integer> {

//    @Modifying
//    @Query(value = "update customer set name_customer=:nameCustomer," +
//            " day_of_birth=:dayOfBirth, gender=:gender, id_card=:idCard, number_phone=:numberPhone," +
//            " email=:email, address=:address where id_customer=:idCustomer ", nativeQuery = true)
//    void editCustomer(@Param("nameCustomer") String nameCustomer, @Param("dayOfBirth") String dayOfBirth,
//                      @Param("gender") int gender, @Param("idCard") String idCard, @Param("numberPhone") String numberPhone,
//                      @Param("email") String email, @Param("address") String address, @Param("idCustomer") int idCustomer);

    @Query(value = "select * from Customer where name_customer like :word", nativeQuery = true)
    Page<Customer> searchByName(Pageable pageable, @Param("word") String word);
}
