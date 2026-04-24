package com.adnan.striver.heaps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// LeetCode 846: MEDIUM
// LeetCode 1296: MEDIUM

// https://leetcode.com/problems/hand-of-straights/
// https://leetcode.com/problems/divide-array-in-sets-of-k-consecutive-numbers/

// Approach: We sort the array at first so that our map stores the keys in sorted format.
// If we don't sort then some numbers can eat up other numbers without actually forming
// a valid group and that's a problem. We can use TreeMap or Heap but sorting with normal
// hashmap works like a charm. We count the occurrence of each element. Then we start
// iterating over the hands (meaning the smallest of elements). We try to form groups. If
// we find that the starting number is not available we try the next number. When trying to
// form the group if we find that next consecutive number is not available that means our
// group is invalid and we return false. Otherwise, we decrement the count of element meaning
// they are now consumed and if the count turns 0 we remove that key.

public class HandOfStraights {

    // Time Complexity: O(N log N + N) ~ O(N log N)
    // Reason: Even though there are 2 loops but second loop runs for N iterations only because we decrement exactly N times.
    // Space Complexity: O(N)
    public boolean isNStraightHand(int[] hands, int groupSize) {
        if(hands.length % groupSize != 0) return false;

        Arrays.sort(hands);
        Map<Integer, Integer> freq = new HashMap<>();
        for(int hand: hands)
            freq.put(hand, freq.getOrDefault(hand, 0) + 1);

        for(int i = 0; i <= hands.length - 1; i++) {
            int num = hands[i];

            if(!freq.containsKey(num))
                continue;

            for(int j = num; j < num + groupSize; j++) {
                if(!freq.containsKey(j))
                    return false;

                freq.put(j, freq.get(j) - 1);

                if(freq.get(j) == 0)
                    freq.remove(j);
            }
        }

        return true;
    }
}