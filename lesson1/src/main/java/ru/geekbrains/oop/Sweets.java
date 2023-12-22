package ru.geekbrains.oop;

public class Sweets extends Product{

    private double weight; //в граммах
    private boolean forDiabetics;
    private int ccal;


    public Sweets(String name, String brand, double price, double weight, boolean forDiabetics, int ccal) {
        super(name, brand, price);
        this.weight = weight;
        this.forDiabetics = forDiabetics;
        this.ccal = ccal;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isForDiabetics() {
        return forDiabetics;
    }

    public void setForDiabetics(boolean forDiabetics) {
        this.forDiabetics = forDiabetics;
    }

    public int getCcal() {
        return ccal;
    }

    public void setCcal(int ccal) {
        this.ccal = ccal;
    }

    @Override
    public String displayInfo() {
        String sugar = "";
        if(forDiabetics) {
            sugar = "без сахара";

        }
        else  sugar = "с сахаром";
        return String.format("[Сладость] %s - %s - %.2f; Вес: %.2f; Ккалории: %d; %s",
                name, brand, price, weight, ccal, sugar);
    }
}
