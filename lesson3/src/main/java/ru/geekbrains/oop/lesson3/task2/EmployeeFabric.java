package ru.geekbrains.oop.lesson3.task2;

import java.io.BufferedReader;
import java.util.Objects;
import java.util.Random;

public class EmployeeFabric {

    private static Random random = new Random();
//    public static Employee generateWorker() {
//        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
//        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
//        int salary = random.nextInt(60000, 120001);
//        int age = random.nextInt(20, 71);
//        return new Worker(
//                names[random.nextInt(names.length)],
//                surnames[random.nextInt(surnames.length)],age,
//                salary);
//    }
    public static Employee generateEmployee() {
        String[] names = new String[]{"Мария", "Анастасия", "Кирилл", "Петр", "Павел", "Николай", "Анна"};
        String[] surnames = new String[]{"Петров", "Сидоров", "Смирнов", "Павлов", "Николаев", "Акунин", "Копытов"};
        int salary = random.nextInt(1000, 2500);

        int age = random.nextInt(20, 71);
        int randomID = random.nextInt(0, 2);
        if (randomID == 1) {
            return new Worker(
                    names[random.nextInt(names.length)],
                    surnames[random.nextInt(surnames.length)], age,
                    salary);
        }
        else {
            int hourWorkInDay = random.nextInt(0, 10);
            int dayWork = random.nextInt(0, 27);
            return new Freelancer(
                names[random.nextInt(names.length)],
                surnames[random.nextInt(surnames.length)], age,
                salary, hourWorkInDay, dayWork);
    }
    }

    /**
     * TODO: Переработать метод generateEmployees, метод должен генерировать рабочих
     *  разных типов (Worker, Freelancer) в рамках домашней работы
     * @param count
     * @return
     */
    public static Employee[] generateEmployees(int count) {
        Employee[] employees = new Employee[count];
        for (int i = 0; i < count; i++) {
                    employees[i] = generateEmployee();

       }
        return  employees;
    }


}
