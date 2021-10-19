package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left >= right ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int max = Max.max(4, 5);
        System.out.println(max);
        max = Max.max(7, 3);
        System.out.println(max);
        max = Max.max(4, 4);
        System.out.println(max);
    }
}
