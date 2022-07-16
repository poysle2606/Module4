package codegym.model;

public class Medical {
    private String name;
    private Integer yearOfBirth;
    private String gender;
    private String national;
    private Integer idCard;
    private String move;
    private String idCar;
    private Integer numberChair;
    private Integer dayStart;
    private Integer monthStart;
    private Integer yearStart;
    private Integer dayEnd;
    private Integer monthEnd;
    private Integer yearEnd;
    private String information14Day;

    public Medical() {
    }

    public Medical(String name, Integer yearOfBirth, String gender, String national, Integer idCard,
                   String move, String idCar, Integer numberChair, Integer dayStart, Integer monthStart,
                   Integer yearStart, Integer dayEnd, Integer monthEnd, Integer yearEnd, String information14Day) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.national = national;
        this.idCard = idCard;
        this.move = move;
        this.idCar = idCar;
        this.numberChair = numberChair;
        this.dayStart = dayStart;
        this.monthStart = monthStart;
        this.yearStart = yearStart;
        this.dayEnd = dayEnd;
        this.monthEnd = monthEnd;
        this.yearEnd = yearEnd;
        this.information14Day = information14Day;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(Integer yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }

    public Integer getIdCard() {
        return idCard;
    }

    public void setIdCard(Integer idCard) {
        this.idCard = idCard;
    }

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }

    public String getIdCar() {
        return idCar;
    }

    public void setIdCar(String idCar) {
        this.idCar = idCar;
    }

    public Integer getNumberChair() {
        return numberChair;
    }

    public void setNumberChair(Integer numberChair) {
        this.numberChair = numberChair;
    }

    public Integer getDayStart() {
        return dayStart;
    }

    public void setDayStart(Integer dayStart) {
        this.dayStart = dayStart;
    }

    public Integer getMonthStart() {
        return monthStart;
    }

    public void setMonthStart(Integer monthStart) {
        this.monthStart = monthStart;
    }

    public Integer getYearStart() {
        return yearStart;
    }

    public void setYearStart(Integer yearStart) {
        this.yearStart = yearStart;
    }

    public Integer getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(Integer dayEnd) {
        this.dayEnd = dayEnd;
    }

    public Integer getMonthEnd() {
        return monthEnd;
    }

    public void setMonthEnd(Integer monthEnd) {
        this.monthEnd = monthEnd;
    }

    public Integer getYearEnd() {
        return yearEnd;
    }

    public void setYearEnd(Integer yearEnd) {
        this.yearEnd = yearEnd;
    }

    public String getInformation14Day() {
        return information14Day;
    }

    public void setInformation14Day(String information14Day) {
        this.information14Day = information14Day;
    }
}
