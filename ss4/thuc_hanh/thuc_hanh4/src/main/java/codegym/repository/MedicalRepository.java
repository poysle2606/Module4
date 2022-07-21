package codegym.repository;

import codegym.model.Medical;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MedicalRepository implements IMedicalRepository {

    static List<Medical> medicalList = new ArrayList<>();

    static {
        medicalList.add(new Medical(1, "Julie", "1998", "Air plane", "12", "12", "2013", "15", "12", "2013", "Da Nang"));
        medicalList.add(new Medical(2, "Jennie", "1999", "O To", "12", "12", "2013", "15", "12", "2013", "Phu Quoc"));
        medicalList.add(new Medical(3, "Hulk", "2001", "Boat", "12", "12", "2013", "15", "12", "2013", "Da Nang"));
        medicalList.add(new Medical(4, "Thor", "1998", "Air plane", "12", "12", "2013", "15", "12", "2013", "Binh Dinh"));
        medicalList.add(new Medical(5, "Cap", "2003", "O to", "12", "12", "2013", "15", "12", "2013", "Hue"));
    }

    @Override
    public List<Medical> findAll() {
        return medicalList;
    }

    @Override
    public String[] getYearOfBirth() {
        String[] year = {"1995", "1996", "1997", "1998", "1999", "2000"};
        return year;
    }

    @Override
    public String[] getMove() {
        String[] move = {"Air plane", "O to", "Boat", "More(write)"};
        return move;
    }

    @Override
    public String[] getDayStart() {
        String[] dayStart = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21",
                "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        return dayStart;
    }

    @Override
    public String[] getMonthStart() {
        String[] monthStart = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
        return monthStart;
    }

    @Override
    public String[] getYearStart() {
        String[] yearStart = {"2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022"};
        return yearStart;
    }

    @Override
    public String[] getDayEnd() {
        String[] dayEnd = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21",
                "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        return dayEnd;
    }

    @Override
    public String[] getMonthEnd() {
        String[] monthEnd = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
        return monthEnd;
    }

    @Override
    public String[] getYearEnd() {
        String[] yearEnd = {"2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022"};
        return yearEnd;
    }

    @Override
    public void create(Medical medical) {
        medicalList.add(medical);
    }

    @Override
    public Medical findId(int id) {
        Medical medical = null;
        for (Medical u : medicalList) {
            if (u.getId() == id) {
                medical = new Medical(u.getId(), u.getName(), u.getYearOfBirth(), u.getMove(),
                        u.getDayStart(), u.getMonthStart(), u.getYearStart(), u.getDayEnd(),
                        u.getMonthEnd(), u.getYearEnd(), u.getInformation14Days());
            }
        }
        return medical;
    }

    @Override
    public void edit(Medical medical, int id) {
        for (Medical item: medicalList) {
            if(item.getId() == id) {
                item.setName(medical.getName());
                item.setYearOfBirth(medical.getYearOfBirth());
                item.setMove(medical.getMove());
                item.setDayStart(medical.getDayStart());
                item.setMonthStart(medical.getMonthStart());
                item.setYearStart(medical.getYearStart());
                item.setDayEnd(medical.getDayEnd());
                item.setMonthEnd(medical.getMonthEnd());
                item.setYearEnd(medical.getYearEnd());
                item.setInformation14Days(medical.getInformation14Days());
            }
        }
    }
}
