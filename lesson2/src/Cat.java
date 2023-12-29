
//Допустим, в программе есть класс Кот.
// У кота есть кличка и аппетит (сколько единиц еды он потребляет за приём
//        пищи).
//        Эти поля мы заполняем с помощью конструктора. Также есть метод eat(), который заставляет
//        кота покушать, но пока что он пустой, так как неизвестно, откуда кот должен брать еду:

//1. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
// (например, в миске 10 еды, а кот пытается покушать 15-20).
//2. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
// Если коту удалось покушать (хватило еды), сытость = true.
// Считаем, что если коту мало еды в тарелке, то он её просто не трогает,
// то есть не может быть наполовину сыт (это сделано для упрощения логики программы).


public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Plate pl) {

        if(pl.getFood() - appetite < 0) {
            System.out.printf("В тарелке недостаточно еды для кота по имени %s! \n", getName());
        }
        else {
            pl.setFood(pl.getFood() - appetite);
            satiety = true;

        }




    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public void printSatiety() {
        if(satiety){
            System.out.printf("%s сытый\n", getName());
        }
        else System.out.printf("%s голодный\n", getName());
    }

}
