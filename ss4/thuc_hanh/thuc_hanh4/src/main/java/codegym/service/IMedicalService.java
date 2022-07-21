package codegym.service;

import codegym.model.Medical;

import java.util.List;

public interface IMedicalService {

    List<Medical> findAll();

    String[] getYearOfBirth();

    String[] getMove();

    String[] getDayStart();

    String[] getMonthStart();

    String[] getYearStart();

    String[] getDayEnd();

    String[] getMonthEnd();

    String[] getYearEnd();

    void create(Medical medical);

    Medical findId(int id);

    void edit(Medical medical, int id);
}
