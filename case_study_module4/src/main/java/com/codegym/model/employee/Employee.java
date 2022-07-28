package com.codegym.model.employee;

import com.codegym.model.user.User;

import javax.persistence.*;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEmployee;
    private String nameEmployee;
    private String dayOfBirth;
    private String idCard;
    private double salary;
    private String numberPhone;
    private String email;
    private String address;


    @ManyToOne
    @JoinColumn(name = "positionId", referencedColumnName = "id")
    private Position position;

    @ManyToOne
    @JoinColumn(name = "educationDegreeId", referencedColumnName = "id")
    private EducationDegree educationDegree;

    @ManyToOne
    @JoinColumn(name = "divisionId", referencedColumnName = "id")
    private Division division;

    @ManyToOne
    @JoinColumn(name = "userName", referencedColumnName = "username")
    private User user;


    public Employee() {
    }

    public Employee(int idEmployee, String nameEmployee, String dayOfBirth, String idCard, double salary, String numberPhone, String email, String address, Position position, EducationDegree educationDegree, Division division, User user) {
        this.idEmployee = idEmployee;
        this.nameEmployee = nameEmployee;
        this.dayOfBirth = dayOfBirth;
        this.idCard = idCard;
        this.salary = salary;
        this.numberPhone = numberPhone;
        this.email = email;
        this.address = address;
        this.position = position;
        this.educationDegree = educationDegree;
        this.division = division;
        this.user = user;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public EducationDegree getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(EducationDegree educationDegree) {
        this.educationDegree = educationDegree;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

}

