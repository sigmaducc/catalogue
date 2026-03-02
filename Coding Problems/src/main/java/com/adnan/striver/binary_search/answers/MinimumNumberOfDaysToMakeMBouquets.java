package com.adnan.striver.binary_search.answers;

// LeetCode 1482: MEDIUM
// https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/

// Approach: If we take min from the array that will be the least number of flowers we can have.
// If we take the max that would represent the max number of flowers we can have. So now our task
// is to find the min number of days I would need to make m bouquets with k flowers.
// Eg: [1,10,3,10,2] m=3 k=1
// Here, on day one I get 1 flower, on day 2 - 2 flowers, on day 3 - 3 flowers and on day 10 2 flowers.
// Meaning on first day I have only 1 flower and on 10th day I have total 5 flowers.
// So if we try to apply binary search on this range from min <-> max we can find a day which is the min
// day, where we can make m bouquets with k flowers.
// We write a function that counts bouquets given a day and k.
// We increment flowers if the current day is bigger than nums[i] and reset flowers whenever the day is
// lesser than nums[i]. Whenever we match flowers == k we increment bouquet and reset flowers
// If we get a day, where the bouquet is greater or equal we move left because we need minimum number of days.
// Now why do we return low? Because it is the lowest index where our condition exits. Meaning the point at
// which we can no longer minimize.

public class MinimumNumberOfDaysToMakeMBouquets {

    // Time Complexity: O(n * log (max-min))
    // Space Complexity: O(1)
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length < (long) m*k) return -1;

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for(int i = 0; i <= bloomDay.length - 1; i++) {
            if(bloomDay[i] < low) low = bloomDay[i];
            if(bloomDay[i] > high) high = bloomDay[i];
        }

        while(low <= high) {
            int mid = low+(high-low)/2;
            int bouquetCount = countBouquet(bloomDay, mid, k);
            if(bouquetCount >= m) {
                high = mid-1;
            } else {
                low = mid+1;
            }
        }

        return low;
    }

    private int countBouquet(int[] bloomDay, int day, int k) {
        int bouquet = 0;
        int flowers = 0;
        for(int i = 0; i <= bloomDay.length - 1; i++) {
            if(day >= bloomDay[i]) {
                flowers++;
            } else {
                flowers = 0;
            }

            if(flowers == k) {
                flowers = 0;
                bouquet++;
            }
        }

        return bouquet;
    }
}