import java.util.Arrays;

public class RecursiveMergeSort {
    public static void main(String args[]) {
        // int[] arr = {5, -2, 8, -10, 3};
        int[] arr = {3, 1, 2, 4, 1, 5, 2, 6, 4};
        int[] aux = new int[arr.length];

        System.out.println("Before sort: " + Arrays.toString(arr));

        mergeSort(arr, aux, 0, arr.length - 1);

        System.out.println("After sort: " + Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int[] aux, int low, int high) {
        if(low >= high) return;

        int mid = low + (high - low) / 2;

        mergeSort(arr, aux, low, mid);
        mergeSort(arr, aux, mid + 1, high);

        merge(arr, aux, low, mid, high);
    }

    public static void merge(int[] arr, int[] aux, int low, int mid, int high) {
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