package ru.geekbrains.oop.sample;

import ru.geekbrains.oop.Product;

public class Program {

    public static void main(String[] args) {
        Product product1 = new Product(null, "ООО Источник", -200);
        System.out.println(product1.displayInfo());
    }
}
