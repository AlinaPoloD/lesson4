

//3. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки
// и потом вывести информацию о сытости котов в консоль.




public class Main {
    public static void main(String[] args) {

        Plate plate = new Plate(120);
        plate.info();

        Cat[] cats = {
                new Cat("Барсик", 10),
                new Cat("Персик", 50),
                new Cat("Вася", 80),
                new Cat("Рыжик", 30)

        };
            for (Cat cat : cats) {
                cat.eat(plate);
                cat.printSatiety();
            }
            plate.info();

            plate.addFood(1000);
            plate.info();





        }
    }

