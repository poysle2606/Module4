package com.codegym.repository.facility;

import com.codegym.model.facility.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

@Transactional
public interface IFacilityRepository extends JpaRepository<Facility, Integer> {
    
    @Query(value = "select * from Facility where name=:name",nativeQuery = true)
    Page<Facility> findByName(Pageable pageable, @Param("name") String name);

}
