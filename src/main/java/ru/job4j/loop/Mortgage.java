package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 1;
        double dolg = amount + amount * (percent / 100);
        while (dolg >= salary) {
            dolg = dolg + dolg * (percent / 100) - salary;
            year++;
        }
        return year;
    }
}
