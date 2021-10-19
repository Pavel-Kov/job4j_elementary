package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ac + bc > ac && ab + bc > ac;
    }

    public static void  main(String[] args) {
        System.out.println(Triangle.exist(10, 10, 15));
        System.out.println(Triangle.exist(5, 5, 15));
    }
}
