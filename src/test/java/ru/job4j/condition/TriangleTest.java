package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void whenExist() {
        double ab = 10;
        double ac = 10;
        double bc = 15;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertTrue(result);
    }

    @Test
    public void notExist() {
        double ab = 5;
        double ac = 5;
        double bc = 15;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertFalse(result);
    }
}