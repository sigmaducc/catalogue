package com.adnan.striver.sorting2;

public abstract class BaseMergeSort {
    public abstract void sort(int[] arr);

    protected static void merge(int[] arr, int[] aux, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        int k = low;

        for(int i = low; i <= high; i++) {
            aux[i] = arr[i];
        }

        while(left <= mid && right <= high) {
            if(aux[left] <= aux[right]) {
                arr[k] = aux[left];
                left++;
                k++;
            } else {
                arr[k] = aux[right];
                right++;
                k++;
            }
        }

        while(left <= mid) {
            arr[k] = aux[left];
            left++;
            k++;
        }

        while(right <= high) {
            arr[k] = aux[right];
            right++;
            k++;
        }
    }
}