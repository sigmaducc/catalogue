package com.adnan.striver.binary_search.answers;

// LeetCode 875: MEDIUM
// https://leetcode.com/problems/koko-eating-bananas/

// Approach: If Koko eats 1 banana it would take her sum(piles) days to complete all the bananas
// If Koko eats max(piles) bananas it would take her nums.length days to complete all the bananas.
// So, taking this analogy in mind let's start with 1 and go until max(piles). We calculate the mid
// Now to know if that mid is the actual number of banana's that Koko should eat we need to check if
// she were to eat K bananas how many hours it would take. So we simply, divide each element with the
// mid we got and take ceil and add them all up that would give us the total number of hours koko would
// need to finish all the bananas. If the hours we get is greater, then we know that Koko needs to eat more
// bananas meaning we move right. Similarly, if the hours we get is lesser,then we know Koko needs to eat
// lesser bananas so we move left.

// Eg: h = 4;
// hours: [_, _,10, 8, _, 6, _, _, _, _, _]
// k:     [1, 2, 3, 4, 5, 6, 7, 8, 10, 11] (1 .. max(piles))
//                        ^
// Here: hours > h -> so we increase k meaning low=mid+1; Because of inverse relationship


public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Integer.MIN_VALUE;

        for(int i = 0; i <= piles.length - 1; i++) {
            high = Math.max(high, piles[i]);
        }

        while(low < high) {
            int mid = low + (high-low)/2;
            int hours = countHours(piles, mid);
            if(hours > h) {
                low = mid+1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    private int countHours(int[] piles, int k) {
        int hours = 0;
        for(int i = 0; i <= piles.length - 1; i++) {
            hours += (piles[i]+k-1)/k;
        }
        return hours;
    }
}