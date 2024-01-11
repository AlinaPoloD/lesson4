package ru.geekbrains.oop.lesson3.task2;

import java.util.ArrayList;
import java.util.Arrays;

public class Program {

    public static void main(String[] args) {




        Employee[] employeer = EmployeeFabric.generateEmployees(20);

        for (Employee employee : employeer) {
            System.out.println(employee);
        }




        System.out.println();
        System.out.println("**********Отсортированный список по возрасту**********");
        System.out.println();


        Arrays.sort(employeer, new AgeComparator());

        for (Employee employee : employeer) {
            System.out.println(employee);
        }

        System.out.println("**********Отсортированный список по ЗП**********");
        System.out.println();


        Arrays.sort(employeer, new SalaryComparator());

        for (Employee employee : employeer) {
            System.out.println(employee);
        }





    }

}
