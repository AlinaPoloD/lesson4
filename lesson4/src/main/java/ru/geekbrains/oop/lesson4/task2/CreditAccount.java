package ru.geekbrains.oop.lesson4.task2;

public class CreditAccount<T extends PersonalData> extends Account<T>{
    public CreditAccount(T data, double amount) {
        super(data, amount);
    }
}
