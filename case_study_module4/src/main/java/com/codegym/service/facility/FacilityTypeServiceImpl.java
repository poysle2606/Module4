package com.codegym.service.facility;

import com.codegym.model.facility.FacilityType;
import com.codegym.repository.facility.IFacilityTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacilityTypeServiceImpl implements IFacilityTypeService{

    @Autowired
    IFacilityTypeRepository  iFacilityTypeRepository;
    @Override
    public List<FacilityType> findAll() {
        return iFacilityTypeRepository.findAll();
    }

    @Override
    public FacilityType findById(int id) {
        return iFacilityTypeRepository.findById(id).orElse(null);
    }
}
