package com.company.sorting;

public class MergeSort {
    public static void merge(int[] array, int left, int middle, int right) {
        int leftSubArrLength = middle - left + 1;
        int rightSubArrLength = right - middle;
        int[] leftSubArr = new int[leftSubArrLength];
        int[] rightSubArr = new int[rightSubArrLength];
        for (int i =0;i<leftSubArrLength;i++) {
            leftSubArr[i] = array[left + i];
        }
        for (int i =0;i< rightSubArrLength;i++) {
            rightSubArr[i] = array[middle+i+1];
        }
        int index = 0;
        int indexLeft = 0;
        int indexRight = 0;
        while(indexLeft < leftSubArrLength && indexRight < rightSubArrLength) {
            if (leftSubArr[indexLeft] < rightSubArr[indexRight]) {
                array[left + (index++)] = leftSubArr[indexLeft++];
            } else {
                array[left + (index++)] = rightSubArr[indexRight++];
            }
        }
        if (indexLeft == leftSubArrLength) {
            for (int i = indexRight; i < rightSubArrLength; i++) {
                array[left + (index++)] = rightSubArr[indexRight++];
            }
        } else {
            for (int i = indexLeft; i < leftSubArrLength; i++) {
                array[left + (index++)] = leftSubArr[indexLeft++];
            }
        }
    }

    public static void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    public static void sort(int[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            sort(array, left, middle);
            sort(array, middle + 1, right);
            merge(array, left, middle, right);
        }
    }
}
