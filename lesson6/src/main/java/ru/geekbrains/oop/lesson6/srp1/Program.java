package ru.geekbrains.oop.lesson6.srp1;

public class Program {

    public static void main(String[] args) {
        Square square = new Square(new Point(1,1), 5);
        SquareDrawer squareDrawer = new SquareDrawer(square, 1);
        squareDrawer.setScale(3);
        System.out.printf("Площадь фигуры: %d \n", square.getArea());

        squareDrawer.draw();
    }

}
