package com.adnan.striver.sorting2;

import com.adnan.striver.sorting1.BaseSort;

import java.util.Arrays;

public class QuickSort implements BaseSort {

    @Override
    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    public int findPartition(int[] arr, int low, int high) {
        int i = low;
        int j = high;

        while(i < j) {
            while(arr[i] <= arr[low] && i < high) i++;
            while(arr[low] < arr[j] && j > low) j--;

            if(i < j) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        int temp = arr[j];
        arr[j] = arr[low];
        arr[low] = temp;

        return j;
    }

    public void quickSort(int[] arr, int low, int high) {
        if(low >= high) return;

        int partitionIndex = findPartition(arr, low, high);

        quickSort(arr, low, partitionIndex - 1);
        quickSort(arr, partitionIndex + 1, high);
    }
}
