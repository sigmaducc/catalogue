package com.adnan.striver.binary_search.array_2d;

// LeetCode 1901: MEDIUM
// https://leetcode.com/problems/find-a-peak-element-ii/

// Approach:
// We apply binary search on columns first. Meaning we find a column then we need to
// find the max element in that column that will represent the row.
// Once we get this row, we know one thing for sure the elements on top and bottom
// will always be lesser because we take max in the column. So we just need to check for
// left and right. If in case we find an element which is bigger than left and right we
// know it is peak element. If left is bigger that means we need to move left else right.

public class FindAPeakElement2 {

    // Time Complexity: O(n * log m)
    // Space Complexity: O(1)
    public int[] findPeakGrid(int[][] mat) {
        int m = mat[0].length;
        int low = 0; int high = m-1;

        while(low <= high) {
            int mid = low+(high-low)/2;

            int row = findMaxElement(mat, mid);

            int current = mat[row][mid];
            int left = mid == 0 ? -1 : mat[row][mid-1];
            int right = mid == m-1 ? -1 : mat[row][mid+1];

            if(left < current && current > right) {
                return new int[] {row, mid};
            } else if(left > current) {
                high = mid-1;
            } else {
                low = mid+1;
            }
        }

        return new int[] {-1, -1};
    }

    private int findMaxElement(int[][] matrix, int col) {
        int n = matrix.length;

        int row = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i <= n - 1; i++) {
            if(matrix[i][col] > max) {
                max = matrix[i][col];
                row = i;
            }
        }

        return row;
    }

    // Greedy approach - Optimal but asymptotically same as bruteforce
    // Time Complexity: O(m * n)
    // Space Complexity: O(1)
//    public int[] findPeakGrid(int[][] mat) {
//        int row = 0;
//        int col = 0;
//        int[] coords = checkNeighbors(mat, row, col);
//
//        while(coords[0] != row || coords[1] != col) {
//            row = coords[0];
//            col = coords[1];
//            int[] newCoords = checkNeighbors(mat, row, col);
//            coords[0] = newCoords[0];
//            coords[1] = newCoords[1];
//        }
//
//        return coords;
//    }
//
//    private int[] checkNeighbors(int[][] matrix, int row, int col) {
//        int center = matrix[row][col];
//        int left = col == 0 ? Integer.MIN_VALUE : matrix[row][col-1];
//        int right = col == matrix[0].length-1 ? Integer.MIN_VALUE : matrix[row][col+1];
//        int top = row == 0 ? Integer.MIN_VALUE : matrix[row-1][col];
//        int bottom = row == matrix.length-1 ? Integer.MIN_VALUE : matrix[row+1][col];
//
//        int max = center;
//        int[] coords = { row, col };
//
//        if(left > max) {
//            max = left;
//            coords[0] = row;
//            coords[1] = col-1;
//        }
//
//        if(top > max) {
//            max = top;
//            coords[0] = row-1;
//            coords[1] = col;
//        }
//
//        if(right > max) {
//            max = right;
//            coords[0] = row;
//            coords[1] = col+1;
//        }
//
//        if(bottom > max) {
//            max = bottom;
//            coords[0] = row+1;
//            coords[1] = col;
//        }
//
//        return coords;
//    }

    // Bruteforce
    // Time Complexity: O(m * n)
    // Space Complexity: O(1)
//    public int[] findPeakGrid(int[][] mat) {
//        int[] coords = new int[2];
//
//        for(int row = 0; row <= mat.length - 1; row++) {
//            for(int col = 0; col <= mat[0].length - 1; col++) {
//                if(isPeak(mat, row, col)) return new int[] {row, col};
//            }
//        }
//
//        return coords;
//    }
//
//    private boolean isPeak(int[][] matrix, int row, int col) {
//        int center = matrix[row][col];
//
//        int left = col == 0 ? Integer.MIN_VALUE : matrix[row][col-1];
//        int right = col == matrix[0].length - 1 ? Integer.MIN_VALUE : matrix[row][col+1];
//        int top = row == 0 ? Integer.MIN_VALUE : matrix[row-1][col];
//        int bottom = row == matrix.length - 1 ? Integer.MIN_VALUE : matrix[row+1][col];
//
//        return center > left && center > right && center > top && center > bottom;
//    }
}