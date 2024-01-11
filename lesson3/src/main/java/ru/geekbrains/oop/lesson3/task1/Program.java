package ru.geekbrains.oop.lesson3.task1;

public class Program {

    /**
     Задача 1
     ========
     Создать классы Собака и Кот с наследованием от класса Животное.
     Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
     Результатом выполнения действия будет печать в консоль. (Например, dog1.run(150); -> 'Бобик пробежал 150 м.');
     У каждого животного есть ограничения на действия
     (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
     Добавить подсчет созданных котов, собак и животных.
     */

    public static void main(String[] args) {

        Animal[] animals = {
                new Cat("Барсик", 1000, 0),
                new Dog("Шарик", 200, 300),
                new Cat("Персик", 3000, 0),
                new Dog("Тузик", 200, 100),
                new Dog("Бима", 400, 4000)
        };




        for (Animal a : animals){
            System.out.printf("#%d - %s\n", a.getId(), a.getName());
        }



        int catCounter = 0;
        for (Animal a : animals){

            if (a instanceof Cat){
                catCounter++;
            }


            a.run(200);
            a.swim(10);
            a.run(1200);
            a.swim(210);
            a.run(3200);
            a.swim(210);
            a.run(2200);
            a.swim(150);
        }


        Dog dog1 = new Dog("Бима", 400, 4000);

        System.out.printf("#%d - %s\n", dog1.getId(), dog1.getName());


        System.out.println("Всего животных: " + Animal.getSumCounter() );
        System.out.println("Всего котиков: " + Cat.getSumCounter() );
        System.out.println("Всего собак: " + Dog.getSumCounter() );

        Cat cat1 = new Cat("Котик#1", 200, 20);
        cat1.run(200);
        Animal cat2 = new Cat("Котик#2", 300, 30);
        cat2.run(200);


    }



}
