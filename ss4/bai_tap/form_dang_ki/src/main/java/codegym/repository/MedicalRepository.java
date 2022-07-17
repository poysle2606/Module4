package codegym.repository;

import codegym.model.Medical;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class MedicalRepository implements IMedicalRepository {
    List<Medical> medical1 = new ArrayList<>();


    @Override
    public Integer[] getYearOfBirth() {
        Integer[] yearOfBirth = {1990, 1991, 1992, 1993, 1994, 1995, 1996, 1997, 1998, 1999, 2000};
        return yearOfBirth;
    }

    @Override
    public String[] getGender() {
        String[] gender = {"Nam", "Nữ", "Khác"};
        return gender;
    }

    @Override
    public String[] getNational() {
        String[] national = {"Vietnam", "American", "Japan", "Korea", "Thai Land"};
        return national;
    }

    @Override
    public String[] getMove() {
        String[] move = {"Airplane", "Ships", "Oto", "More(writing)"};
        return move;
    }

    @Override
    public Integer[] getDayStart() {
        Integer[] dayStart = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,
                16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};
        return dayStart;
    }

    @Override
    public Integer[] getMonthStart() {
        Integer[] monthStart = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        return monthStart;
    }

    @Override
    public Integer[] getYearStart() {
        Integer[] yearStart = {2022, 2021, 2020, 2019, 2018, 2017, 2016, 2015, 2014, 2013, 2012};
        return yearStart;
    }

    @Override
    public Integer[] getDayEnd() {
        Integer[] dayEnd = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,
                16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};
        return dayEnd;
    }

    @Override
    public Integer[] getMonthEnd() {
        Integer[] monthEnd = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        return monthEnd;
    }

    @Override
    public Integer[] getYearEnd() {
        Integer[] yearEnd = {2022, 2021, 2020, 2019, 2018, 2017, 2016, 2015, 2014, 2013, 2012};
        return yearEnd;
    }

    @Override
    public void editForm(Medical medical) {
//        medical.setName();
    }

    @Override
    public Medical findIdCard(Integer idCard) {
        Medical medical1 = null;
      Integer id = medical1.getIdCard();
        if (idCard.equals(id)){
            medical1 = new Medical(medical1.getName(),medical1.getYearOfBirth(),medical1.getGender(),
                    medical1.getNational(), medical1.getIdCard(), medical1.getMove(), medical1.getIdCar(),
                    medical1.getNumberChair(), medical1.getDayStart(), medical1.getMonthStart(), medical1.getYearStart(),
                    medical1.getDayEnd(), medical1.getMonthEnd(), medical1.getYearEnd(), medical1.getInformation14Day());
        }
        return medical1;
    }

    @Override
    public void addMedical(Medical medical) {
        medical1.add(medical);
    }
}