package com.codegym.service.facility;

import com.codegym.model.facility.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IFacilityService {

    Page<Facility> findAll(Pageable pageable);

    void create(Facility facility);

    void update(Facility facility);

    void delete(int id);

    Facility findById(int id);

    Page<Facility> findByName(Pageable pageable,String name);
}
