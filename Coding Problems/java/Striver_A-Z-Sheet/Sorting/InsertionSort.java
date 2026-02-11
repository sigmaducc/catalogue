import java.util.Arrays;

public class InsertionSort {
    public static void main(String args[]) {
        int[] nums = {13, 46, 24, 52, 20, 9};
        // int[] nums = {1, 2, 3, 4, 5, 6};
        System.out.println("nums: " + Arrays.toString(nums));
        int[] result = insertionSort(nums);
        System.out.println("result: " + Arrays.toString(result));
    }

    public static int[] insertionSort(int[] arr) {
        int count = 0;
        for(int i = 0; i <= arr.length - 1; i++) {
            int j = i;
            while(j > 0 && arr[j-1] > arr[j]) {
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;

                count++;
            }
        }

        System.out.println("Count: " + count);

        return arr;
    }
}