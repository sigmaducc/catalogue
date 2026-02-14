package com.adnan.striver.arrays.easy;

// Leetcode 1886: EASY

// After a lot of brainstorming I understood that we have to use 12th maths.
// 90 deg clockwise rotation = (transpose + reverse rows) or (reverse cols + transpose);
// 180 deg clockwise rotation = reverse rows + reverse cols;
// 270 deg clockwise rotation = (transpose + reverse cols) or (reverse rows + transpose);

// We can also use 90 deg rotation 1,2,3,4 times to obtain 90, 180, 270 and 360 deg. But that
// will be expensive because we will have to transpose for every 90deg. For 180deg reverse cols
// and reverse rows is best.

public class DetermineWhetherMatrixCanBeObtainedByRotation {

    // For every rotation it takes 3 * n^2. One for transpose, reversal and match.
    // We do that 3 times so total 9 * n^2 but we also have one extra early check
    // which makes it 10 * n^2. But we drop constants so it is O(n * n).
    // Time Complexity: O(10 * n^2) for matrix of size n
    // Space Complexity: O(1)
    public boolean findRotation(int[][] mat, int[][] target) {
        if(match(mat, target)) return true;

        for(int deg = 0; deg < 360; deg += 90) {
            transpose(mat);

            for(int i = 0; i < mat.length; i++) {
                reverseRow(mat[i]);
            }

            if(match(mat, target)) return true;
        }

        return false;
    }

    private boolean match(int[][] matrix, int[][] target) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                if(matrix[i][j] != target[i][j])
                    return false;
            }
        }

        return true;
    }

    private void reverseRow(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while(i < j) {
            int aux = arr[i];
            arr[i] = arr[j];
            arr[j] = aux;

            i++;
            j--;
        }
    }

    private void transpose(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = i; j < matrix.length; j++) {
                int aux = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = aux;
            }
        }
    }
}