package com.codegym.repository;

import com.codegym.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

@Transactional
public interface IBookRepository extends JpaRepository<Book, Integer> {

    @Query(value = "select * from Book where id_book=:idBook", nativeQuery = true)
    Book findById(@Param("idBook") int idBook);
}
