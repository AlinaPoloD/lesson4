package ru.geekbrains.oop.lesson7.observer;


import java.util.ArrayList;
import java.util.Random;

public class VacancyFactory {

    static Random random = new Random();


    static Vacancy generateVacancy(EmployeeType employeeType){
        return switch (employeeType){
            case Cleaning -> new Vacancy(new Cleaning(), random.nextInt(7000, 30000));
            case TeamLead -> new Vacancy(new TeamLead(), random.nextInt(150000, 200000));
            case ITSpecialist -> new Vacancy(new ITSpecialist(),random.nextInt(25000, 60000));
            
        };
    }

    static Vacancy generateEmploye(){
        int typeIndex = random.nextInt(3);
        return switch (typeIndex) {
            case 0 -> generateVacancy(EmployeeType.ITSpecialist);
            case 1 -> generateVacancy(EmployeeType.TeamLead);
            case 2 -> generateVacancy(EmployeeType.Cleaning);

            default -> null;
        };
    }

    static ArrayList<Vacancy> generateVacancys(int count){
        ArrayList<Vacancy> vacancies = new ArrayList<>();
        for (int i = 0; i < count; i++){
            vacancies.add(generateEmploye());
        }
        return vacancies;
    }
}
