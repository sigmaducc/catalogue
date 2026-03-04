package com.adnan.striver.arrays.medium;

import java.util.ArrayList;
import java.util.List;

// LeetCode 54: MEDIUM
// https://leetcode.com/problems/spiral-matrix/

// The solution I came up with took 3-4hrs but it is kind of the best lol
// I used only iterator to go through the walls.
// Then passed the matrix to itself which means it can handle itself.
// The issue came with edge cases. Such as 1*1, M*1, 1*N, even/odd sized array.
// I eventually handled the edge cases but it was time consuming.

// The approach I found on LeetCode is much simpler.
// We keep 4 variables. left, right, top and bottom.
// On each iteration we increment left and top and decrement
// right and bottom more like a shrinking cage.
// Then we simply iterate top row, right col, bottom row and left col.
// Need to handle one case where top and bottom should not flip and
// same with left and right. They flip when the size is even. When
// the size is odd they sit perfectly together on the same value.

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        return spiralOrder1(matrix);
    }

    // Time Complexity: O(m * n)
    // Space Complexity: O(m * n)
    private List<Integer> spiralOrder1(int[][] matrix) {
        int M = matrix[0].length;
        int N = matrix.length;

        List<Integer> list = new ArrayList<>(M*N);

        int top = 0;
        int bottom = N - 1;
        int left = 0;
        int right = M - 1;

        while(left <= right && top <= bottom) {
            for(int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++;

            for(int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;

            if(top <= bottom) {
                for(int i = right; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left <= right) {
                for(int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }

        return list;
    }

    // Time Complexity: O(m * n)
    // Space Complexity: O(m * n)
    private List<Integer> spiralOrder2(int[][] matrix) {
        int M = matrix[0].length;
        int N = matrix.length;

        ArrayList<Integer> list = new ArrayList<>(M*N);

        appendElements(matrix, list, 0, M-1, N-1);

        return list;
    }

    private void appendElements(int[][] matrix, List<Integer> list, int level, int m, int n) {
        int M = matrix[0].length;
        int N = matrix.length;

        // if in any case m or n goes below 0
        if(m < 0 || n < 0) return;

        // For even we don't allow going above M/2
        // For odd we allow M/2
        if(M % 2 == 0)
            if(level >= M/2) return;
            else
            if(level > M/2) return;

        // For even we don't allow going above N/2
        // For odd we allow N/2
        if(N % 2 == 0)
            if(level >= N/2) return;
            else
            if(level > N/2) return;

        // For M*1 or 1*N sized matrix
        if((m > 0 && n == 0) || (n > 0 && m == 0)) {
            for(int col = level; col <= m; col++) {
                for(int row = level; row <= n; row++) {
                    int el = matrix[row][col];
                    list.add(el);
                }
            }

            return;
        }

        // We always start from level: (0,0), (1,1), (2,2)
        int row = level;
        int col = level;

        // Boolean which switches after every (m-1) + (n-1) elements;
        // True means we iterate forward, false means we iterate backwards.
        boolean dir = true;

        // After every level we need to reduce the size of actual
        // elements that needs to be traversed. Because the walls
        // are demolished from both sides. Hence, multiply level by 2.
        int mSize = M - 2*level;
        int nSize = N - 2*level;

        // Simple formula: (m-1) + (n-1) + (m-1) + (n-1)
        // Derived: 2*(m-1) + 2*(n-1) => 2*(m+n-2)
        int noOfBorderEls = 2 * (mSize + nSize - 2);

        // For M*1 or 1*N sized nested matrix
        if(mSize == 1 || nSize == 1) {
            noOfBorderEls = Math.max(mSize, nSize);
        }

        for(int i = 0; i < noOfBorderEls; i++) {
            list.add(matrix[row][col]);

            if(dir) {
                if(col < m) {
                    col++;
                } else if (row < n) {
                    row++;
                }

                if(row == n && col == m) {
                    dir = false;
                }
            } else {
                if(col > level) {
                    col--;
                } else if(row > level + 1 && col == level) {
                    // Here we stop before 1 because that would simply bring
                    // us to the first position which will complete the loop
                    // meaning we will have a duplicate element (first one).
                    row--;
                }
            }
        }

        appendElements(matrix, list, level+1, m-1, n-1);
    }
}