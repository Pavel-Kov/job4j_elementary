package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap2to4() {
        int[] input = {5, 6, 7, 8, 9};
        int source = 2;
        int dest = 4;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {5, 6, 9, 8, 7};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap1to6() {
        int[] input = {9, 8, 7, 6, 5, 4, 3, 2};
        int source = 1;
        int dest = 6;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {9, 3, 7, 6, 5, 4, 8, 2};
        Assert.assertArrayEquals(expected, result);
    }
}