package ru.geekbrains.oop.lesson7.observer;

public class Master implements Observer {

    private String name;
    private int salary;

    public Master(String name){
        this.name = name;
        salary = 80000;
    }

    @Override
    public void receiveOffer(String nameCompany, Vacancy vacancy) {
        if ((this.salary <= vacancy.getSalary() && (!vacancy.getEmployee().equals("Клининг")))){
            System.out.printf("Специалист %s: Мне нужна эта работа! (компания: %s; должность: %s; заработная плата: %d)\n",
                    name, nameCompany,vacancy.getEmployee(), vacancy.getSalary());
            this.salary = vacancy.getSalary();
        }
        else {
            System.out.printf("Специалист %s: Я найду работу получше! (компания: %s; должность: %s; заработная плата: %d)\n",
                    name, nameCompany, vacancy.getEmployee(), vacancy.getSalary());
        }
    }
}
