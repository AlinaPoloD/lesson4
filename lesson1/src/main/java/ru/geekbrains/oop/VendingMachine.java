package ru.geekbrains.oop;

import java.util.List;
import java.util.Objects;

public class VendingMachine {

    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public BottleOfMilk getBottleOfMilk(double volume){
        for (Product product : products){
            if (product instanceof BottleOfMilk){
                BottleOfMilk milk = (BottleOfMilk)product;
                if (milk.getVolume() == volume)
                    return milk;
            }
        }
        return null;
    }


    public Sweets getSweets(boolean forDiabetics) {
        for (Product product : products){
            if (product instanceof Sweets){
                Sweets sweets = (Sweets) product;
                if (sweets.isForDiabetics() == forDiabetics)
                    return sweets;
            }
        }
        return null;


    }





}
