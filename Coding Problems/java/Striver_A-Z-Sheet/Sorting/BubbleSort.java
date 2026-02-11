import java.util.Arrays;

public class BubbleSort {
    public static void main(String args[]) {
        int[] nums = {13, 46, 24, 52, 20, 9};
        // int[] nums = {1, 2, 3, 4, 5, 6};
        System.out.println("nums: " + Arrays.toString(nums));
        int[] result = bubbleSort(nums);
        System.out.println("result: " + Arrays.toString(result));
    }

    public static int[] bubbleSort(int[] arr) {
        int count = 0;
        for(int i = arr.length - 1; i >= 0; i--) {
            boolean swapped = false;
            for(int j = 0; j <= i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
                count++;
            }

            // For best case scenario when the array is already sorted then early exit else keep going.
            if(!swapped)
                break;
        }

        System.out.println("count: " + count);

        return arr;
    }
}