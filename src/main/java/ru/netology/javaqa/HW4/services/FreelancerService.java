package ru.netology.javaqa.HW4.services;

public class FreelancerService {

    public int calculate(int income, int expenses, int threshold) {
        int monthsOfRest = 0;
        int money = 0;

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                monthsOfRest++;
                money -= expenses * 4;
            } else {
                money += income - expenses;
            }
        }

        return monthsOfRest;
    }
}