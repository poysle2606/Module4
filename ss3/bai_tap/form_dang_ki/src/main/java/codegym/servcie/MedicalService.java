package codegym.servcie;

import codegym.repository.IMedicalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicalService implements IMedicalService {

    @Autowired
    IMedicalRepository iMedicalRepository;

    @Override
    public Integer[] getYearOfBirth() {
        return iMedicalRepository.getYearOfBirth();
    }

    @Override
    public String[] getGender() {
        return iMedicalRepository.getGender();
    }

    @Override
    public String[] getNational() {
        return iMedicalRepository.getNational();
    }

    @Override
    public String[] getMove() {
        return iMedicalRepository.getMove();
    }

    @Override
    public Integer[] getDayStart() {
        return iMedicalRepository.getDayStart();
    }

    @Override
    public Integer[] getMonthStart() {
        return iMedicalRepository.getMonthStart();
    }

    @Override
    public Integer[] getYearStart() {
        return iMedicalRepository.getYearStart();
    }

    @Override
    public Integer[] getDayEnd() {
        return iMedicalRepository.getDayEnd();
    }

    @Override
    public Integer[] getMonthEnd() {
        return iMedicalRepository.getMonthEnd();
    }

    @Override
    public Integer[] getYearEnd() {
        return iMedicalRepository.getYearEnd();
    }
}
