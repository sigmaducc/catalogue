import java.util.Arrays;

public class SelectionSort {
    public static void main(String args[]) {
        int[] nums = {13, 46, 24, 52, 20, 9};
        System.out.println("nums: " + Arrays.toString(nums));
        int[] result = selectionSort(nums);
        System.out.println("result: " + Arrays.toString(result));
    }

    public static int[] selectionSort(int[] arr) {
        int count = 0;
        for(int i = 0; i < arr.length - 1; i++) {
            int min_index = i;

            for(int j = i; j <= arr.length - 1; j++) {

                // Compare min_index number and j'th iteration number if the j'th element 
                // is smaller than min_index number then store that j index. Then swap!
                if(arr[min_index] > arr[j]) {
                    min_index = j;
                }
                count++;
            }

            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Count: " + count);

        return arr;
    }
}