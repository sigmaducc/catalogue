package com.adnan.striver.graphs;

import java.util.ArrayDeque;
import java.util.Deque;

// LeetCode 542: MEDIUM
// https://leetcode.com/problems/01-matrix/

// Approach: Simple BFS traversal from 0 to 1's while maintaining depth at each level

public class ZeroOneMatrix {

    // Time Complexity: O(N * M + N * M)
    // Space Complexity: O(N * M)
    public int[][] updateMatrix(int[][] mat) {
        int m = mat[0].length;
        int n = mat.length;
//        boolean[][] visited = new boolean[n][m];

        Deque<int[]> q = new ArrayDeque<>();

        for(int row = 0; row < n; row++) {
            for(int col = 0; col < m; col++) {
                if(mat[row][col] == 0) {
                    q.offer(new int[] { row, col, 0 });
//                    visited[row][col] = true;
                } else {
                    mat[row][col] = -1;
                }
            }
        }

        int[][] dirs = {{1,0}, {-1,0}, {0,1}, {0,-1}};
        while(!q.isEmpty()) {
            int[] rcc = q.poll();

            int row = rcc[0];
            int col = rcc[1];
            int count = rcc[2];

            mat[row][col] = count;

            for(int[] dir: dirs) {
                int r = row + dir[0];
                int c = col + dir[1];

//                if(r >= 0 && r < n && c >= 0 && c < m && !visited[r][c]) {
                if(r >= 0 && r < n && c >= 0 && c < m && mat[r][c] == -1) {
                    mat[r][c] = 0;
                    q.offer(new int[] { r, c, count + 1 });
//                    visited[r][c] = true;
                }
            }
        }

        return mat;
    }
}