package com.adnan.striver.binary_search.array_2d;

// LeetCode 74: MEDIUM
// https://leetcode.com/problems/search-a-2d-matrix/

// Approach: Since the whole array is sorted we can take low as first element and high as last element
// We find mid and if it is equal to target we return and if it is lesser than target we move right
// else we move left.
// Only trick here is to use find right indexes.
// We divide by M to find the row. Think of it like this M + M + M
// Then we modulate using M to find col.

public class SearchA2DMatrix {

    // Time Complexity: O(log (m * n))
    // Space Complexity: O(1)
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix[0].length;
        int n = matrix.length;

        int low = 0;
        int high = m*n - 1;

        while(low <= high) {
            int mid = low + (high-low)/2;

            int row = mid / m;
            int col = mid % m;

            if(matrix[row][col] == target) {
                return true;
            } else if(matrix[row][col] < target) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }

        return false;
    }
}