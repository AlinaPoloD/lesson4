package ru.geekbrains.oop.lesson4.homework;


import java.util.ArrayList;

public class Box <T extends Fruit>{

    private float weightBox;
    private int count;
    private ArrayList<T> box;

    private int id;

    private static int counter = 0;

    public int getId() {
        return id;
    }


    public Box() {
        box = new ArrayList<>();
        this.count = 0;
        id = ++counter;
    }

    public void add(T e){

        box.add(e);
        this.count = count +1;
        this.weightBox = count * e.getWeight();

    }


    public float getWeightBox() {
        return weightBox;
    }


//    e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
//    подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
//    Можно сравнивать коробки с яблоками и апельсинами;

    public boolean compare(Box <?> e) {
        return getWeightBox()== e.getWeightBox();

    }

//    f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
//    Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
//            Соответственно, в текущей коробке фруктов не остается, а в другую
//            перекидываются объекты, которые были в первой;

    public void pourOut(Box <T> inThisBox){
        if (getWeightBox() == 0) {
            System.out.println("Коробка пустая, пересыпать нечего");
        }
        else if(inThisBox.getId()==getId()) {
            System.out.println("Нельзя пересыпать коробку в саму себя");

        }
        else {
            System.out.printf("Коробка №%s удачно пересыпана в коробку №%s\n", getId(), inThisBox.getId());
            inThisBox.weightBox = inThisBox.getWeightBox() + getWeightBox();
            weightBox=0;
        }


    }

    public void printWeight(){
        System.out.printf("Вес  коробки №%s - %s\n", getId(), getWeightBox());
    }



}
