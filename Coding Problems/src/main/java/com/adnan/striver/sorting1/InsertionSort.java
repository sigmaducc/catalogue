package com.adnan.striver.sorting1;

public class InsertionSort implements BaseSort {
    public void sort(int[] arr) {
        for(int i = 0; i <= arr.length - 1; i++) {
            int j = i;
            while(j > 0 && arr[j-1] > arr[j]) {
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
}