package com.codegym.service.facility;

import com.codegym.model.facility.Facility;
import com.codegym.repository.facility.IFacilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class FacilityServiceImpl implements IFacilityService{

    @Autowired
    IFacilityRepository iFacilityRepository;

    @Override
    public Page<Facility> findAll(Pageable pageable) {
        return iFacilityRepository.findAll(pageable);
    }

    @Override
    public void create(Facility facility) {

    }

    @Override
    public void update(Facility facility) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Facility findById(int id) {
        return null;
    }

    @Override
    public Page<Facility> findByName(Pageable pageable, String name) {
        return null;
    }
}
