package codegym.model;

public class Medical {
    private int id;
    private String name;
    private String yearOfBirth;
    private String move;
    private String dayStart;
    private String monthStart;
    private String yearStart;
    private String dayEnd;
    private String monthEnd;
    private String yearEnd;
    private String information14Days;

    public Medical() {
    }

    public Medical(int id, String name, String yearOfBirth, String move, String dayStart,
                   String monthStart, String yearStart, String dayEnd, String monthEnd,
                   String yearEnd, String information14Days) {
        this.id = id;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.move = move;
        this.dayStart = dayStart;
        this.monthStart = monthStart;
        this.yearStart = yearStart;
        this.dayEnd = dayEnd;
        this.monthEnd = monthEnd;
        this.yearEnd = yearEnd;
        this.information14Days = information14Days;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }

    public String getDayStart() {
        return dayStart;
    }

    public void setDayStart(String dayStart) {
        this.dayStart = dayStart;
    }

    public String getMonthStart() {
        return monthStart;
    }

    public void setMonthStart(String monthStart) {
        this.monthStart = monthStart;
    }

    public String getYearStart() {
        return yearStart;
    }

    public void setYearStart(String yearStart) {
        this.yearStart = yearStart;
    }

    public String getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(String dayEnd) {
        this.dayEnd = dayEnd;
    }

    public String getMonthEnd() {
        return monthEnd;
    }

    public void setMonthEnd(String monthEnd) {
        this.monthEnd = monthEnd;
    }

    public String getYearEnd() {
        return yearEnd;
    }

    public void setYearEnd(String yearEnd) {
        this.yearEnd = yearEnd;
    }

    public String getInformation14Days() {
        return information14Days;
    }

    public void setInformation14Days(String information14Days) {
        this.information14Days = information14Days;
    }
}
