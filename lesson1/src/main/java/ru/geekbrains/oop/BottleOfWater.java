package ru.geekbrains.oop;

public class BottleOfWater extends Product{

    private double volume;

    public double getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public BottleOfWater(String name, String brand, double price, double volume){
        super(name, brand, price);
        this.volume = volume;
    }

    @Override
    public String displayInfo() {
        return String.format("[Бутылка с водой] %s - %s - %.2f; Объем: %.2f",
                name, brand, price, volume);
    }



}
