package ru.job4j.math;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumDivAndSub(double first, double second) {
        return div(first, second)
                + sub(first, second);
    }

    public static double sumAll(double first, double second) {
        return div(first, second)
                + sub(first, second)
                + sum(first, second)
                + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета 1 равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета 2 равен: " + sumDivAndSub(10, 20));
        System.out.println("Результат расчета 3 равен: " + sumAll(10, 20));
    }
}
