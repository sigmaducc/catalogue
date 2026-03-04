package com.adnan.striver.binary_search.answers;

// LeetCode 1011: MEDIUM
// https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/

// Approach: Approach is similar to other binary search questions.
// Eg: If we take low as 1 then there would be a problem because we can't load other
// items on the ship. So we will have to start at max(weights) which would give ~n as
// number of days. And if we took weight as sum(weights) we would only need 1 day
// to ship all containers. So the problem again becomes going from ~n <-> 1 based on
// max(weights) <-> sum(weights). So again there is inverse relationship.
// Eg: [1,2,3,4,5,6,7,8,9,10]   days=5
// But if I take 10 as weight then I can load in 7 days.
// If I take some mid-value like 22 which would give us 3 days
// If I take 55 as weight then I can load in 1 day.
// If you see the threshold need is 5 which lies in left half. Meaning when the counted days is
// lesser than threshold we move left. And if we get the counted days greater than threshold we move right.

public class CapacityToShipPackagesWithinDDays {

    // Time Complexity: O(n * log (sum(weights) - max(weights)))
    // Space Complexity: O(1)
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;

        for(int i = 0; i <= weights.length - 1; i++) {
            low = Math.max(low, weights[i]);
            high += weights[i];
        }

        while(low <= high) {
            int mid = low + (high-low)/2;
            int day = countDays(weights, mid);
            if(day <= days) {
                high = mid-1;
            } else {
                low = mid+1;
            }
        }

        return low;
    }

    private int countDays(int[] weights, int weight) {
        int days = 1;
        int sum = 0;

        for(int i = 0; i <= weights.length - 1; i++) {
            sum += weights[i];

            if(sum > weight) {
                sum = weights[i];
                days++;
            }
        }

        return days;
    }
}