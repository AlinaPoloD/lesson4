package ru.geekbrains.oop.lesson4.task1;

public class Program {

    public static void main(String[] args) {
        MyArrayList<Employee> myArrayList = new MyArrayList<>(new Employee[100]);
        // myArrayList.add(12);
        // myArrayList.add("Hello, GeekBrains!");
        myArrayList.add(new Employee("Name #1"));


        Employee element1 = myArrayList.get(0);
        System.out.println(element1.getName());


        System.out.println("Кол-во элементов: " + myArrayList.size());

    }

}
