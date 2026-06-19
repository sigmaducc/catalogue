package com.adnan.leetcode.daily_coding_challenge._2026.may;

public class CyclicallyRotatingAGrid_09May2026 {
    public int[][] rotateGrid(int[][] grid, int k) {
        rotate(grid, 0, grid.length - 1, 0, grid[0].length - 1, k);
        return grid;
    }

    private void rotate(int[][] grid, int top, int bottom, int left, int right, int k) {
        if(left >= right) return;
        if(top >= bottom) return;

        int kCopy = k % (2 * (right - left) + 2 * (bottom - top));

        while (kCopy-- > 0) {
            int topleft = grid[top][left];

            for(int i = left + 1; i <= right; i++) {
                grid[top][i-1] = grid[top][i];
            }

            for(int i = top + 1; i <= bottom; i++) {
                grid[i-1][right] = grid[i][right];
            }

            for(int i = right - 1; i >= left; i--) {
                grid[bottom][i+1] = grid[bottom][i];
            }

            for(int i = bottom - 1; i >= top; i--) {
                grid[i+1][left] = grid[i][left];
            }

            grid[top+1][left] = topleft;
        }

        rotate(grid, top + 1, bottom - 1, left + 1, right - 1, k);
    }
}