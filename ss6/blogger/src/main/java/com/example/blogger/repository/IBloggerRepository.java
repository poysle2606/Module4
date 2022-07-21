package com.example.blogger.repository;

import com.example.blogger.model.Blogger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

@Transactional
public interface IBloggerRepository extends JpaRepository<Blogger, Integer> {

    @Modifying
    @Query(value = "update Blogger set content=:content,name=:name, status=:status where id=:id",nativeQuery = true)
    void update(@Param("content") String content, @Param("name") String name, @Param("status") String status, @Param("id") int id);
}
