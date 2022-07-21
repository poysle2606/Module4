package codegym.servcie;

import codegym.model.Medical;

public interface IMedicalService {
    Integer[] getYearOfBirth();

    String[] getGender();

    String[] getNational();

    String[] getMove();

    Integer[] getDayStart();

    Integer[] getMonthStart();

    Integer[] getYearStart();

    Integer[] getDayEnd();

    Integer[] getMonthEnd();

    Integer[] getYearEnd();

    void editForm(Medical medical);

    Medical findIdCard(Integer idCard);

    void addMedical(Medical medical);
}