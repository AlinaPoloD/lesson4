package ru.geekbrains.oop.lesson7.observer;

import ru.geekbrains.oop.lesson7.factory.Employee;
import ru.geekbrains.oop.lesson7.factory.EmployeeFactory;

import java.util.ArrayList;

public class Program {
    /**
     *  TODO: Доработать приложение, которое разрабатывалось на семинаре,
     *  поработать с шаблоном проектирования Observer,
     *  добавить новый тип соискателя.
     *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  Только после этого вы можете усложнить ваше приложение (при желании), например,
     *  добавить тип вакансии (enum),
     *  учитывать тип вакансии при отправке предложения соискателю.
     * @param args
     */
    public static void main(String[] args) {
        Publisher publisher = new JobAgency();

        ArrayList<Vacancy> vacancy = VacancyFactory.generateVacancys(8);


        Company google = new Company("Google", publisher,vacancy.get(0));
        Company yandex = new Company("Yandex", publisher, vacancy.get(1));
        Company geekBrains = new Company("GeekBrains", publisher, vacancy.get(2));
        Company skillbox = new Company("skillbox", publisher, vacancy.get(3));
        Company skillbox1 = new Company("skillbox", publisher, vacancy.get(4));
        Company google1 = new Company("google", publisher, vacancy.get(5));
        Company yandex1 = new Company("yandex", publisher, vacancy.get(6));
        Company bmw = new Company("bmw", publisher, vacancy.get(7));

        Student student1 = new Student("Студент #1");
        Master master1 = new Master("Мастер #1");
        Master master2 = new Master("Мастер #2");

        publisher.registerObserver(student1);
        publisher.registerObserver(master1);
        publisher.registerObserver(master2);

        for (int i = 0; i < 3; i++){
            google.needEmployee();
            yandex.needEmployee();
            geekBrains.needEmployee();
            skillbox1.needEmployee();
            skillbox.needEmployee();
            google1.needEmployee();
            yandex1.needEmployee();
            bmw.needEmployee();
        }

    }

}
