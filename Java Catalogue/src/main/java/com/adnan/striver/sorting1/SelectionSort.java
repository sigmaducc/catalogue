package com.adnan.striver.sorting1;

public class SelectionSort implements BaseSort {
    public void sort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            int min_index = i;

            for(int j = i; j <= arr.length - 1; j++) {

                // Compare min_index number and j'th iteration number if the j'th element 
                // is smaller than min_index number then store that j index. Then swap!
                if(arr[min_index] > arr[j]) {
                    min_index = j;
                }
            }

            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
    }
}