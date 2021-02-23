package com.company.sorting;

public class InsertionSort {
    public static void sort(int[] array) {
        for (int j = 0; j < array.length; j++) {
            int key = array[j];
            int i = j - 1;
            while (i >= 0 && key < array[i]) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }
}
