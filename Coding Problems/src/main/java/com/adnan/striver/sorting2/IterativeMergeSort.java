package com.adnan.striver.sorting2;

public class IterativeMergeSort extends BaseMergeSort {
    @Override
    public void sort(int[] arr) {
        int[] aux = new int[arr.length];

        mergeSort(arr, aux);
    }

    public static void mergeSort(int[] arr, int[] aux) {
        int n = arr.length;
        for(int width = 1; width < n; width = width * 2) {
            for(int low = 0; low < n - 1; low = low + width + width) {
                int mid = Math.min(low + width - 1, n - 1);
                int high = Math.min(low + width + width - 1, n - 1);

                merge(arr, aux, low, mid, high);
            }
        }
    }
}