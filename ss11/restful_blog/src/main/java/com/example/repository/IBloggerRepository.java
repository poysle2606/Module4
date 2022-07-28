package com.example.repository;

import com.example.model.Blogger;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Transactional
public interface IBloggerRepository extends JpaRepository<Blogger,Integer> {

    @Modifying
    @Query(value = "update Blogger set content=:content,name=:name, status=:status, day_start=:dayStart where id=:id",nativeQuery = true)
    void update(@Param("content") String content, @Param("name") String name, @Param("status") String status, @Param("dayStart") Date dayStart, @Param("id") int id);

    @Query(value = "select * from Blogger where name like :search", nativeQuery = true)
    List<Blogger> searchByName(@Param("search") String name);
}
