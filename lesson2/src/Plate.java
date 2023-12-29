//Чтобы можно было хранить еду, создадим класс Тарелка с полем food (еда измеряется в целых
//        числах и не важно, что это за единицы измерения). При создании тарелки мы можем указать
//начальное значение food. В процессе работы с помощью метода info() можно вывести в консоль
//информацию о тарелке.

//4. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void info() {

        System.out.println("plate: " + food);
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }
    public void addFood(int feed) {
        food += feed;
    }

}

