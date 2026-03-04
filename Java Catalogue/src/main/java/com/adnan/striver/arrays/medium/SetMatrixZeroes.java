package com.adnan.striver.arrays.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// LeetCode 73: MEDIUM
// https://leetcode.com/problems/set-matrix-zeroes/

// A simple solution that works great is use 2 hash sets to store the i'th and j'th indices.
// we then iterate over both sets and mark those positions as 0.

// The real trick is to solve it within O(1) space.
// In this trick we need to take the first row and col as flag markers.
// We then go from 1..m and 1..n and mark all the positions 0 which have
// first row/col as 0.
// But to know if the first row or col needs to be updated or not (because note that we
// are using 0 to modify zeroes, hence there is no way to know if we modified it to zero
// if that zero belonged there). For this purpose we keep track if there was a zero in row/col.
// So 2 flags for that. If there were original zeroes in first row/col we simply mark all the
// elements in row/col to zero.

public class SetMatrixZeroes {

    // Time Complexity: O(m * n)
    // Space Complexity: O(m + n)
    public void setZeroes(int[][] matrix) {
        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 0) {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }

        for(int row: rows) {
            for(int i = 0; i < matrix[0].length; i++) {
                matrix[row][i] = 0;
            }
        }

        for(int col: cols) {
            for(int i = 0; i < matrix.length; i++) {
                matrix[i][col] = 0;
            }
        }

        System.out.println(rows);
        System.out.println(cols);

        System.out.println(Arrays.deepToString(matrix));
    }

    // Time Complexity: O(m * n)
    // Space Complexity: O(1)
//    public void setZeroes(int[][] matrix) {
//        boolean firstRowHasZero = false;
//        boolean firstColHasZero = false;
//
//        int m = matrix[0].length;
//        int n = matrix.length;
//
//        for(int i = 0; i < m; i++) {
//            if(matrix[0][i] == 0) {
//                firstRowHasZero = true;
//                break;
//            }
//        }
//
//        for(int i = 0; i < n; i++) {
//            if(matrix[i][0] == 0) {
//                firstColHasZero = true;
//                break;
//            }
//        }
//
//        for(int i = 1; i < m; i++) {
//            for(int j = 1; j < n; j++) {
//                if(matrix[j][i] == 0) {
//                    matrix[0][i] = 0;
//                    matrix[j][0] = 0;
//                }
//            }
//        }
//
//        for(int i = 1; i < m; i++) {
//            for(int j = 1; j < n; j++) {
//                if(matrix[0][i] == 0 || matrix[j][0] == 0) {
//                    matrix[j][i] = 0;
//                }
//            }
//        }
//
//        if(firstRowHasZero) {
//            for(int i = 0; i < m; i++) {
//                matrix[0][i] = 0;
//            }
//        }
//
//        if(firstColHasZero) {
//            for(int i = 0; i < n; i++) {
//                matrix[i][0] = 0;
//            }
//        }
//    }
}
