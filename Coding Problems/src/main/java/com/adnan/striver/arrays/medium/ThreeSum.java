package com.adnan.striver.arrays.medium;

import java.util.*;

// Leetcode 15: MEDIUM

// Approach is simple. We iterate over the array once hence handling one variable.
// The other two variables are a left and right pointer. When i + left + right is
// less than sum that means we need to increase sum hence we increment left pointer.
// Bringing the overall sum higher. Similarly, when the sum is greater than the
// target we reduce right pointer. Meaning our sum is exceeding the target limit.
// Finally, when sum matches our target that means it's our triplet. We simply use
// i, left and right pointer and add the triplet into the list.

// Edge Cases: It is possible that when iterating i we encounter same element. If we do
// we simply skip it until the prev element is different. We always check with prev element
// meaning visited element. Because it will be handled either way.
// We handle a similar case for left and right pointer as well. It is possible that we encounter same
// left or right pointer while going over. For left pointer we check with prev value because that
// is what was visited and if it is same we skip it until we find different element.
// In similar way we do it for right pointer but instead we compare with next because we are going
// the other way around. If we encounter same element we skip it until we find one that isn't same as next.

// NOTE: Array needs to be sorted.

public class ThreeSum {

    // Time Complexity: O(n * log n + n * n) ~ O(n^2)
    // Space Complexity: O(n)
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0; i <= nums.length - 1; i++) {
            if(i > 0 && nums[i-1] == nums[i]) continue;

            int left = i+1;
            int right = nums.length - 1;

            // Our target is 0 here.
            // a + b + c = 0
            // b + c = 0 - c
            long newTarget = (long) 0 - nums[i];

            while(left < right) {
                long sum = (long) nums[left] + nums[right];

                if(sum == newTarget) {
                    list.add(List.of(nums[i], nums[left], nums[right]));
                    left++;

                    while(left < right && nums[left-1] == nums[left]) left++;
                    while(right < nums.length - 1 && nums[right] == nums[right+1]) right--;
                } else if(sum < newTarget) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return list;
    }

    // Time Complexity: O(n^2)
    // Space Complexity: O(n + n) ~ O(n)
//    public List<List<Integer>> threeSum(int[] nums) {
//        Set<List<Integer>> set = new HashSet<>();
//
//        for(int i = 0; i <= nums.length - 2; i++) {
//            int target = -nums[i];
//
//            Map<Integer, Integer> map = new HashMap<>();
//
//            for(int j = i + 1; j <= nums.length - 1; j++) {
//                int diff = target - nums[j];
//                if(map.containsKey(diff)) {
//                    set.add(sort3Numbers(nums[i], nums[j], nums[map.get(diff)]));
//                } else {
//                    map.put(nums[j], j);
//                }
//            }
//        }
//
//        return new ArrayList<>(set);
//    };
//
//    private List<Integer> sort3Numbers(int a, int b, int c) {
//        int max = Math.max(a, Math.max(b, c));
//        int min = Math.min(a, Math.min(b, c));
//        int mid = a + b + c - max - min;
//
//        return List.of(min, mid, max);
//    }
}