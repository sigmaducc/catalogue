
// Leetcode: 1838 (MEDIUM)
// https://leetcode.com/problems/frequency-of-the-most-frequent-element/
// Started off on the wrong foot without thinking much. I tried to eat up k until I made all numbers same because of naive logic. 
// Turned out if you have all the same numbers in the array then difference would be 0 and my current logic would not work.
//
// NOTE: Visited solutions I found this gem using sliding windown(which is just a fancier way of saying two pointer but with constant-ish gap). 
// All you have to do is use some brains and think. What if I started big and thought that all elements could be made same by using some constant.
// That is exactly what we are doing here. We will try to assume every element can be upgraded into a number which will maximize our most frequent element requirement.
// If we somehow find out that current element is filling the window and we are overflowing the limit(which is nothing but total of window and + k) we simply reduce 
// the bucket/window size from right. If the the current element filling the window is underflowing then we need to shorten the window from left.
// But we need to sort the numbers list first.  

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.Comparator;

public class FrequencyOfTheMostFrequentElement {
    public static void main(String args[]) {
        // int[] nums = {1, 2, 4};
        // int[] nums = {1, 4, 8, 13};
        int[] nums = {1, 1, 1, 1, 10};
        // int[] nums = {9940,9995,9944,9937,9941,9952,9907,9952,9987,9964,9940,9914,9941,9933,9912,9934,9980,9907,9980,9944,9910,9997};
        // int[] nums = {3, 9, 6};
        // int[] nums = new int[30000];
        // Arrays.fill(nums, 30000);
        int k = 1;
        // int k = 7925;
        System.out.println(maxFrequency(nums, k));
    }

    public static int maxFrequency(int[] nums, int k) {
        int left = 0, maxWindowSize = 0; 
        long total = 0;

        Arrays.sort(nums);

        for(int right = 0; right < nums.length; right++) {
            total += nums[right];

            while((long) nums[right] * (right - left + 1) > total + k) {
                total -= nums[left];
                left++;
            }

            maxWindowSize = Math.max(maxWindowSize, (right - left + 1));
        }

        return maxWindowSize;
    }

    // public static int maxFrequency(int[] nums, int k) {
    //     int i = 0;
    //     int diff = 0;

    //     Arrays.sort(nums);

    //     while (i <= nums.length) {
    //     // while (k >= 0 && diff <= k && i < 1000) {
    //         int iMod = i % nums.length;
    //         int nextIMod = (i + 1) % nums.length;
    //         diff = nums[nextIMod] - nums[iMod];
    //         if(diff > 0 && diff <= k) {
    //             k = k - diff;
    //             nums[iMod] += diff;
    //         } else {
    //             // nums[iMod] += 1; 
    //         }

    //         i++;
    //         System.out.println("nums: " + Arrays.toString(nums) + " nums.length: "+ nums.length + " i: " + iMod + " k: " + k);
    //     }

    //     Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    //     for(int j = 0; j < nums.length; j++) {
    //         if(map.containsKey(nums[j])) {
    //             map.put(nums[j], map.get(nums[j]) + 1);
    //         } else {
    //             map.put(nums[j], 1);
    //         }
    //     }

    //     System.out.println(map);

    //     int maxValue = -1;

    //     for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
    //         int value = entry.getValue();

    //         System.out.println("value: " + value + " maxValue: " + maxValue);

    //         if(value > maxValue) {
    //             maxValue = value;
    //         }
    //     }

    //     return maxValue;
    // }


}