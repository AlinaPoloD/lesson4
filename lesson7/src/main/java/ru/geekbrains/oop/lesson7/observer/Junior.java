package ru.geekbrains.oop.lesson7.observer;

public class Junior implements Observer{
    private String name;
    private int salary;

    public Junior(String name){
        this.name = name;
        salary = 50000;
    }

    @Override
    public void receiveOffer(String nameCompany, Vacancy vacancy) {
        if ((this.salary <= vacancy.getSalary() && (!vacancy.getEmployee().equals("Team lead")))){
            System.out.printf("Начинающий специалист %s: Мне нужна эта работа! (компания: %s; должность: %s; заработная плата: %d)\n",
                    name, nameCompany,vacancy.getEmployee(),  vacancy.getSalary());
            this.salary = vacancy.getSalary();
        }
        else {
            System.out.printf("Начинающий специалист %s: Я найду работу получше! (компания: %s; должность: %s; заработная плата: %d)\n",
                    name, nameCompany,vacancy.getEmployee(),  vacancy.getSalary());
        }
    }
}
