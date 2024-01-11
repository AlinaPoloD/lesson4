package ru.geekbrains.oop.lesson3.task1;

public abstract class Animal {

    private int id;


    private static int sumCounter = 0;

    public static int getSumCounter() {
        return sumCounter;
    }

    private static int counter = 100;

    public static int getCounter(){

        return counter;
    }

    public int getId() {
        return id;
    }

    public Animal(String name, int maxRun, int maxSwim) {
        sumCounter++;
        id = ++counter;
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
    }

    public void run(int distance){
        if (distance <= maxRun){
            System.out.printf("%s пробежал %d метров\n", name, distance);
        }
        else {
            System.out.printf("%s не удалось пробежать %d метров\n", name, distance);
        }
    }

    public void swim(int distance){
        if (distance <= maxSwim){
            System.out.printf("%s проплыл %d метров\n", name, distance);
        }
        else {
            System.out.printf("%s не удалось проплыть %d метров\n", name, distance);
        }
    }

    protected String name;
    protected int maxRun;
    protected int maxSwim;

    public String getName() {
        return name;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxSwim() {
        return maxSwim;
    }



}
