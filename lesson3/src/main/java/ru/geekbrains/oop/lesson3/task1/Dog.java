package ru.geekbrains.oop.lesson3.task1;

public class Dog extends Animal{

    private static int sumCounter = 0;

    public static int getSumCounter() {
        return sumCounter;
    }
    public Dog(String name, int maxRun, int maxSwim) {
        super(name, maxRun, maxSwim);
        sumCounter++;
    }
}
