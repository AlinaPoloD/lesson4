package ru.geekbrains.oop;

public class Product {
    protected String name;
    protected String brand;
    protected double price;

    public void setPrice(double price){
        processPrice(price);
    }

    public double getPrice(){
        return price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    /*public Product(){
        this("[product]", 100);
    }*/

    public Product(String inputName, double inputPrice){
        this(inputName, "[brand]", inputPrice);
    }

    public Product(String name, String brand, double price){
        if (name == null || name.length() < 3){
            this.name = "[product]";
        }
        else {
            this.name = name;
        }
        if (brand == null || brand.length() < 3){
            this.brand = "[brand]";
        }
        else {
            this.brand = brand;
        }
        processPrice(price);
    }

    private void processPrice(double price){
        if (price < 100)
            this.price = 100;
        else{
            this.price = price;
        }
    }

    public String displayInfo(){
        return String.format("%s - %s - %.2f", name, brand, price);
    }


}
