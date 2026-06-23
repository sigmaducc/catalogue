package com.adnan.striver.graphs;

import java.util.ArrayDeque;
import java.util.Deque;

// LeetCode 1765: MEDIUM
// https://leetcode.com/problems/map-of-highest-peak/

// Approach: Simple use BFS traversal from 1 to 0 and at each step maintain the distance.

public class MapOfHighestPeak {

    // Time Complexity: O(N * M + N * M)
    // Space Complexity: O(N * M)
    public int[][] highestPeak(int[][] isWater) {

        int m = isWater[0].length;
        int n = isWater.length;
        // int[][] result = new int[n][m];
        // boolean[][] visited = new boolean[n][m];

        Deque<int[]> q = new ArrayDeque<>();

        for(int row = 0; row < n; row++) {
            for(int col = 0; col < m; col++) {
                if(isWater[row][col] == 1) {
                    isWater[row][col] = 0;
                    q.offer(new int[] { row, col, 0 });
                    // visited[row][col] = true;
                } else {
                    isWater[row][col] = -1;
                }
            }
        }

        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        while(!q.isEmpty()) {
            int[] rcc = q.poll();

            int row = rcc[0];
            int col = rcc[1];
            int count = rcc[2];

            isWater[row][col] = count;

            for(int[] dir: dirs) {
                int r = row + dir[0];
                int c = col + dir[1];

                // if(r >= 0 && r < n && c >= 0 && c < m && !visited[r][c]) {
                if(r >= 0 && r < n && c >= 0 && c < m && isWater[r][c] == -1) {
                    // visited[r][c] = true;
                    isWater[r][c] = 0;
                    q.offer(new int[] { r, c, count+1 });
                }
            }

            // if(col > 0 && !visited[row][col-1]) {
            //     visited[row][col-1] = true;
            //     q.offer(new int[] { row, col-1, count+1 });
            // }

            // if(col < m-1 && !visited[row][col+1]) {
            //     visited[row][col+1] = true;
            //     q.offer(new int[] { row, col+1, count+1 });
            // }

            // if(row > 0 && !visited[row-1][col]) {
            //     visited[row-1][col] = true;
            //     q.offer(new int[] { row-1, col, count+1 });
            // }

            // if(row < n-1 && !visited[row+1][col]) {
            //     visited[row+1][col] = true;
            //     q.offer(new int[] { row+1, col, count+1 });
            // }
        }

        return isWater;
    }
}