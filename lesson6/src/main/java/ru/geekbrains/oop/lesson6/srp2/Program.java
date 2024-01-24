package ru.geekbrains.oop.lesson6.srp2;

public class Program {

    /**
     * TODO: Переработать структуру приложения Order, приложение должно соответствовать
     *  принципу SRP.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Укажите параметры заказа:");
        Order order = new Order();
        Input input = new Input();
        input.inputFromConsole(order);
        SaveToJson json = new SaveToJson();
        SaveToTxt txt = new SaveToTxt();
        txt.save(order);
        json.save(order);


    }

}
