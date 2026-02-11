package com.adnan.striver.sorting1;

public class BubbleSort implements BaseSort {
    public void sort(int[] arr) {
        for(int i = arr.length - 1; i >= 0; i--) {
            boolean swapped = false;
            for(int j = 0; j <= i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }

            // For best case scenario when the array is already sorted then early exit else keep going.
            if(!swapped)
                break;
        }
    }
}