package ru.geekbrains.oop.lesson7.observer;

import java.util.Random;

/**
 * Компания, которая нуждается в сотрудниках
 */
public class Company {

   // private Random random = new Random();
    private Publisher jobAgency;
    private Vacancy vacancy;

    private String name;

    //private int maxSalary;

    public Company(String name, Publisher jobAgency, Vacancy vacancy){
        this.jobAgency = jobAgency;
        this.name = name;
//this.maxSalary = maxSalary;
        this.vacancy = vacancy;

    }

    public void needEmployee(){
        //int salary = random.nextInt(maxSalary);
        jobAgency.sendOffer(name,vacancy);
    }

}
