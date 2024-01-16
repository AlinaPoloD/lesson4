package ru.geekbrains.oop.lesson4.homework;

import ru.geekbrains.oop.lesson4.task1.Employee;
import ru.geekbrains.oop.lesson4.task1.MyArrayList;

public class Program {

    /**
     Домашняя работа, задача:
     ========================

     a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
     b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
     поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
     c. Для хранения фруктов внутри коробки можно использовать ArrayList;
     d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
     вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
     e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
     подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
     Можно сравнивать коробки с яблоками и апельсинами;
     f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
     Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
     Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
     g. Не забываем про метод добавления фрукта в коробку.
     */

    public static void main(String[] args) {

        System.out.println("**********");

        Orange orange1 = new Orange();
        System.out.println("Вес апельсина: " + orange1.getWeight());

        Apple apple1 = new Apple();
        System.out.println("Вес яблока: " + apple1.getWeight());

        Box<Apple> boxApple = new Box<Apple>();
        boxApple.add(apple1);
        boxApple.add(apple1);
        boxApple.add(apple1);
        Box<Apple> boxApple1 = new Box<Apple>();

        System.out.println("**********");

        boxApple.printWeight();

        Box<Orange> boxOrange = new Box<Orange>();
        boxOrange.add(orange1);
        boxOrange.add(orange1);
        boxOrange.add(orange1);
        boxOrange.printWeight();


        Box<Orange> boxOrange2 = new Box<Orange>();
        boxOrange2.add(orange1);
        boxOrange2.add(orange1);
        boxOrange2.add(orange1);
        boxOrange2.printWeight();

        System.out.println("**********");

        System.out.printf("Сравнение коробки с апельсинами №%s и коробки с яблоками №%s: ", boxOrange2.getId(), boxApple.getId());
        System.out.println(boxOrange2.compare(boxApple));
        System.out.printf("Сравнение коробки с апельсинами №%s и коробки с яблоками №%s: ",boxOrange.getId(), boxApple.getId());
        System.out.println(boxOrange.compare(boxApple));
        System.out.printf("Сравнение коробки с апельсинами №%s и коробки с апельсинами №%s: ",boxOrange.getId(), boxOrange2.getId());
        System.out.println(boxOrange.compare(boxOrange2));


        System.out.println("**********");
        System.out.println("Пересыпем коробку с апельсинами в другую коробку : ");
        boxOrange.pourOut(boxOrange2);
        boxOrange.printWeight();
        boxOrange2.printWeight();
        System.out.println("Пересыпем  коробку с апельсинами в другую коробку : ");
        boxOrange.pourOut(boxOrange2);
        boxOrange2.printWeight();
        boxOrange.printWeight();

        System.out.println("Пересыпем коробку с апельсинами в другую коробку : ");
        boxOrange2.pourOut(boxOrange);
        boxOrange2.printWeight();
        boxOrange.printWeight();
        System.out.println("Пересыпем коробку с апельсинами в другую коробку : ");
        boxOrange.pourOut(boxOrange);
        boxOrange.printWeight();
        boxApple.pourOut(boxApple1);
        boxApple.printWeight();
        boxApple1.printWeight();
        boxApple.pourOut(boxApple1);
        boxApple.printWeight();
        boxApple1.printWeight();












    }
}
