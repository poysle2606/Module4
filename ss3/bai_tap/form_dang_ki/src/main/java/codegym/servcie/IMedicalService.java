package codegym.servcie;

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
}
