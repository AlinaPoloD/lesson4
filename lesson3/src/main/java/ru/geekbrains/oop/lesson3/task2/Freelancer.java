package ru.geekbrains.oop.lesson3.task2;

/**
 * Фрилансер (работник с почасовой оплатой)
 * TODO: Доработать в рамках домашней работы
 * Доработать класс Freelancer, при желании можно разработать и свой собственный тип сотрудника.
 * Формула расчета среднемесячной заработной платы может быть такова: «среднемесячная заработная плата = 20.8 * 8 * почасовая ставка»
 */
public class Freelancer extends Employee {
    private int hourWorkInDay;
    private int dayWork;

    /**
     * Фактическая ЗП за этот месяц
     */

    public double getFactSalary() {
        return salary*getDayWork()*getHourWork();
    }
    /**
     * Среднемесячная ЗП
     */
    @Override
    public double calculateSalary() {
        return salary*20.8 * 8;
    }
    /**
     * Количество часов в этом месяце
     */
    public int getHourWork() {
        return hourWorkInDay;
    }


    /**
     * Количество дней в этом месяце
     */
    public int getDayWork() {
        return dayWork;
    }



    public Freelancer(String name, String surName, int age, double salary, int hourWorkInDay, int dayWork) {
        super(name, surName, age, salary);
        this.hourWorkInDay = hourWorkInDay;
        this.dayWork = dayWork;
    }
    public String toString() {
        return String.format("%s %s; Фрилансер, Возраст - %d лет;Фактическая зп за отработанный месяц %.2f  Среднемесячная заработная плата: %.2f руб.",
                surName, name, age, getFactSalary(), calculateSalary());
    }



}
