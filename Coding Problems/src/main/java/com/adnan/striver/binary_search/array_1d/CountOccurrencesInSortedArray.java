package com.adnan.striver.binary_search.array_1d;

// Non LeetCode question (but from striver sheet)
// Refer LeetCode 34: FindLastAndLastPositionOfElementInSortedArray

public class CountOccurrencesInSortedArray {

    // Time Complexity: O(log n + log n) ~ O(log n)
    // Space Complexity: O(1)
    public int count(int[] nums, int target) {
        int first = findFirstOccurrence(nums, target);

        if(first == -1) return 0;

        int last = findLastOccurrence(nums, target);

        return last - first + 1;
    }

    private int findFirstOccurrence(int[] nums, int target) {
        int res = -1; int low = 0; int high = nums.length - 1;

        while(low <= high) {
            int mid = low+(high-low)/2;

            if(nums[mid] == target) {
                res = mid;
                high = mid-1;
            } else if(nums[mid] < target) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }

        return res;
    }

    private int findLastOccurrence(int[] nums, int target) {
        int res = -1; int low = 0; int high = nums.length - 1;

        while(low <= high) {
            int mid = low+(high-low)/2;

            if(nums[mid] == target) {
                res = mid;
                low = mid+1;
            } else if(nums[mid] < target) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }

        return res;
    }

//    public int count(int[] nums, int target) {
//        int[] aux = {Integer.MAX_VALUE, Integer.MIN_VALUE};
//
//        binarySearch(nums, aux, target, 0, nums.length - 1);
//
//        return aux[1] - aux[0] + 1;
//    }
//
//    private void binarySearch(int[] nums, int[] aux, int target, int low, int high) {
//        if(low > high) return;
//
//        int mid = low + (high-low)/2;
//
//        if(nums[mid] == target) {
//            aux[0] = Math.min(aux[0], mid);
//            aux[1] = Math.max(aux[1], mid);
//        } else if(nums[mid] < target) {
//            low = mid+1;
//        } else {
//            high = mid-1;
//        }
//
//        binarySearch(nums, aux, target, low, mid-1);
//        binarySearch(nums, aux, target, mid+1, high);
//    }
}