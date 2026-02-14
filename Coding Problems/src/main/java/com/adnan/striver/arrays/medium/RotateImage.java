package com.adnan.striver.arrays.medium;

// After a lot of brainstorming I understood that we have to use 12th maths.
// 90 deg clockwise rotation = (transpose + reverse rows) or (reverse cols + transpose);
// 180 deg clockwise rotation = reverse rows + reverse cols;
// 270 deg clockwise rotation = (transpose + reverse cols) or (reverse rows + transpose);

// We can also use 90 deg rotation 1,2,3,4 times to obtain 90, 180, 270 and 360 deg. But that
// will be expensive because we will have to transpose for every 90deg. For 180deg reverse cols
// and reverse rows is best.

public class RotateImage {

    // Time Complexity: O(n * n + n * n) ~ O(n^2) for matrix of size n
    // Space Complexity: O(1)
    public void rotate(int[][] matrix) {
        transpose(matrix);
        for(int i = 0; i < matrix.length; i++) {
            reverseRow(matrix[i]);
        }
    }

    private void reverseRow(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }

    private void reverseCol(int[][] matrix, int col) {
        int i = 0;
        int j = matrix.length - 1;

        while(i < j) {
            int aux = matrix[i][col];
            matrix[i][col] = matrix[j][col];
            matrix[j][col] = aux;

            i++;
            j--;
        }
    }

    private void transpose(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = i; j < matrix.length; j++) {
                if(i != j) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
    }
}