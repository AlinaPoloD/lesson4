package ru.geekbrains.oop.lesson7.observer;

public class Student implements Observer{

    private String name;
    private int salary;

    public Student(String name){
        this.name = name;
        salary = 5000;
    }

    @Override
    public void receiveOffer(String nameCompany, Vacancy vacancy) {
        if (this.salary <= vacancy.getSalary() && (!vacancy.getEmployee().equals("Team lead"))){
            System.out.printf("Студент %s: Мне нужна эта работа! (компания: %s; должность: %s; заработная плата: %d)\n",
                    name, nameCompany,vacancy.getEmployee(), vacancy.getSalary());
            this.salary = vacancy.getSalary();
        }
        else {
            System.out.printf("Студент %s: Я найду другую работу! (компания: %s; должность: %s; заработная плата: %d)\n",
                    name, nameCompany,vacancy.getEmployee(), vacancy.getSalary());
        }
    }
}
