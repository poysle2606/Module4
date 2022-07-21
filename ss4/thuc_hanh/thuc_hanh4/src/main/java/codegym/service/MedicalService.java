package codegym.service;

import codegym.model.Medical;
import codegym.repository.IMedicalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalService implements IMedicalService{

    @Autowired
    IMedicalRepository iMedicalRepository;

    @Override
    public List<Medical> findAll() {
        return iMedicalRepository.findAll();
    }

    @Override
    public String[] getYearOfBirth() {
        return iMedicalRepository.getYearOfBirth();
    }

    @Override
    public String[] getMove() {
        return iMedicalRepository.getMove();
    }

    @Override
    public String[] getDayStart() {
        return iMedicalRepository.getDayStart();
    }

    @Override
    public String[] getMonthStart() {
        return iMedicalRepository.getMonthStart();
    }

    @Override
    public String[] getYearStart() {
        return iMedicalRepository.getYearStart();
    }

    @Override
    public String[] getDayEnd() {
        return iMedicalRepository.getDayEnd();
    }

    @Override
    public String[] getMonthEnd() {
        return iMedicalRepository.getMonthEnd();
    }

    @Override
    public String[] getYearEnd() {
        return iMedicalRepository.getYearEnd();
    }

    @Override
    public void create(Medical medical) {
        iMedicalRepository.create(medical);
    }

    @Override
    public Medical findId(int id) {
        return iMedicalRepository.findId(id);
    }

    @Override
    public void edit(Medical medical, int id) {
        iMedicalRepository.edit(medical, id);
    }
}
