package com.company;


import com.company.sorting.InsertionSort;
import com.company.sorting.MergeSort;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class SortingTest {

    private static int[] array;
    private static final int size = 1000;
    private static final int bound = 10000;
    private int[] expectedArray;
    private int[] actualArray;


    @BeforeAll
    static void setUp() {
        Random rd = new Random();
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(bound);
        }
    }

    @BeforeEach
    void setUpArrays() {
        expectedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(expectedArray);
        actualArray = Arrays.copyOf(array, array.length);
    }

    @Test
    public void insertionSort() {
        InsertionSort.sort(actualArray);
        assertArrayEquals(expectedArray, actualArray);
    }


}
