package ru.geekbrains.oop.lesson7.observer;

import java.util.Random;

public class Vacancy {
    private Employee employee;
    private int salary;


    public Vacancy(Employee employee, int salary) {
        this.employee = employee;
        this.salary = salary;
    }


    public String getEmployee() {
        return employee.getSpeciality();
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public int getSalary() {
        return salary;
    }


}
