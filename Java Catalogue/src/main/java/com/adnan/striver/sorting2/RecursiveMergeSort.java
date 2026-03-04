package com.adnan.striver.sorting2;

public class RecursiveMergeSort extends BaseMergeSort {
    @Override
    public void sort(int[] arr) {
        int[] aux = new int[arr.length];

        mergeSort(arr, aux, 0, arr.length - 1);
    }

    public static void mergeSort(int[] arr, int[] aux, int low, int high) {
        if(low >= high) return;

        int mid = low + (high - low) / 2;

        mergeSort(arr, aux, low, mid);
        mergeSort(arr, aux, mid + 1, high);

        merge(arr, aux, low, mid, high);
    }
}