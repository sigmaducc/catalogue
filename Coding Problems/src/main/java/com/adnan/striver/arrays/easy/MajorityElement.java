package com.adnan.striver.arrays.easy;

// Leetcode 169: EASY

// First approach is quite easy, if we simply use a hashmap to store all the elements and their frequency.
// Then we can iterate over map entries and keep track of max element and it's count.
// In the end which ever is max candidate we will return it.

// Second approach uses: Boyer–Moore majority vote algorithm
// Here we keep track of candidate and a max variable.
// We increment the max variable when it's the same candidate else decrement it.
// When we find that max has turned to 0 we simply make that element as candidate.

public class MajorityElement {

    // Time Complexity: O(n)
    // Space Complexity: O(n)
//    public int majorityElement(int[] nums) {
//        Map<Integer, Integer> map = new HashMap<>();
//
//        int max = 0;
//        int max_key = 0;
//        for(int i = 0; i < nums.length; i++) {
//            int el = nums[i];
//            if(map.containsKey(el)) {
//                map.put(el, map.get(el) + 1);
//            } else {
//                map.put(el, 1);
//            }
//
//            if(map.get(el) > max) {
//                max = map.get(el);
//                max_key = el;
//            }
//        }
//
//        return max_key;
//    }

    // Time Complexity: O(n + n) ~ O(n)
    // Space Complexity: O(n)
//    public int majorityElement(int[] nums) {
//        Map<Integer, Integer> map = new HashMap<>();
//
//        for(int i = 0; i < nums.length; i++) {
//            int el = nums[i];
//            if(map.containsKey(el)) {
//                map.put(el, map.get(el) + 1);
//            } else {
//                map.put(el, 1);
//            }
//        }
//
//        int max = 0;
//        int max_key = 0;
//        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
//            int key = entry.getKey();
//            int value = entry.getValue();
//
//            if(value > max) {
//                max = value;
//                max_key = key;
//            }
//        }
//
//        return max_key;
//    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int majorityElement(int[] nums) {
        int max = 0;
        int candidate = 0;

        for(int i = 0; i < nums.length; i++) {
            if(max == 0) {
                candidate = nums[i];
            }

            if(candidate == nums[i]) {
                max++;
            } else {
                max--;
            }
        }

        return candidate;
    }
}
