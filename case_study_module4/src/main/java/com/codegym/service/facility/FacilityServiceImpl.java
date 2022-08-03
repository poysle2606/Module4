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
        iFacilityRepository.save(facility);
    }

    @Override
    public void update(Facility facility) {
        iFacilityRepository.save(facility);
    }

    @Override
    public void delete(int id) {
        iFacilityRepository.deleteById(id);
    }

    @Override
    public Facility findById(int id) {
        return iFacilityRepository.findById(id).orElse(null);
    }

    @Override
    public Page<Facility> findByName(Pageable pageable, String name) {
        return iFacilityRepository.findByName(pageable,"%" + name + "%");
    }
}
