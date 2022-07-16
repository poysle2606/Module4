package codegym.repository;

public interface IMedicalRepository {
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
}
