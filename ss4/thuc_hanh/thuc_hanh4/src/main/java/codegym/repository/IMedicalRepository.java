package codegym.repository;

import codegym.model.Medical;
import org.springframework.ui.Model;

import java.util.List;

public interface IMedicalRepository {

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
