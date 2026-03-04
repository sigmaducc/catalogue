package com.adnan.striver.binary_search.array_2d;

// LeetCode 240: MEDIUM
// https://leetcode.com/problems/search-a-2d-matrix-ii/submissions/

// Approach 1: We iterate over all the rows, and apply binary search in each row for each
// column. Simple binary search with linear search.

// Approach 2: We think of it like two pointers with L path. One pointer is col and one is row.
// Row pointing at first row and col pointing at last col. Meaning we start top right element.
// Whenever we encounter an element which is equal to target we return row, col.
// If the element is bigger than target that means we need to move left on column. (Why? Because
// we know each element in that column is sorted so if the first element is bigger that means all
// the elements are bigger in that column so we skip by moving left.)
// If the element is lesser than the target that means it is the first column which has first
// element lower than target. So we go ahead and check all the values in the column using row.

public class SearchA2DMatrix2 {

    // Time Complexity: O(m+n)
    // Space Complexity: O(1)
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix[0].length;
        int n = matrix.length;

        int row = 0; int col = m-1;

        while(row <= n-1 && col >= 0) {
            if(matrix[row][col] == target) return true;
            else if(matrix[row][col] > target) col--;
            else row++;
        }

        return false;
    }


    // Time Complexity: O(n * log m)
    // Space Complexity: O(1)
//    public boolean searchMatrix(int[][] matrix, int target) {
//        int m = matrix[0].length;
//        int n = matrix.length;
//
//        for(int i = 0; i <= n-1; i++) {
//            if(matrix[i][0] > target) continue;
//
//            int low = 0;
//            int high = m-1;
//            while(low <= high) {
//                int mid = low + (high-low)/2;
//
//                if(matrix[i][mid] == target) {
//                    return true;
//                } else if(matrix[i][mid] < target) {
//                    low = mid+1;
//                } else {
//                    high = mid-1;
//                }
//            }
//        }
//
//        return false;
//    }
}