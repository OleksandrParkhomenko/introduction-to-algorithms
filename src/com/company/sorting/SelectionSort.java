package com.company.sorting;

public class SelectionSort {
    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++){
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int buff = array[minIndex];
            array[minIndex] = array[i];
            array[i] = buff;
         }
    }
}
