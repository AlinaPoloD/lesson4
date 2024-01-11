package ru.geekbrains.oop.lesson3.task1;

public class Cat extends Animal{

    private static int sumCounter = 0;

    public static int getSumCounter() {
        return sumCounter;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRun){
            System.out.printf("%s (котик) пробежал %d метров\n", name, distance);
        }
        else {
            System.out.printf("%s (котик) не удалось пробежать %d метров\n", name, distance);
        }
    }

    public Cat(String name, int maxRun, int maxSwim) {
        super(name, maxRun, maxSwim);
        sumCounter++;
    }
}
