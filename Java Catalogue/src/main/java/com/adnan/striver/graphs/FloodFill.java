package com.adnan.striver.graphs;

import java.util.ArrayDeque;
import java.util.Deque;

// LeetCode 733: EASY
// https://leetcode.com/problems/flood-fill/

// Approach: Simply use a BFS traversal to go to the neighbors of the source and keep
// continuing. Changing colors acts like a visited array so our search is contained.

public class FloodFill {

    // Time Complexity: O(N * M)
    // Space Complexity: O(N * M)
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image[0].length;
        int n = image.length;
        int initialColor = image[sr][sc];

        if(initialColor == color)
            return image;

        int[][] dirs = {{-1,0}, {1,0}, {0, 1}, {0,-1}};

        Deque<int[]> q = new ArrayDeque<>();
        q.offer(new int[] { sr, sc });
        image[sr][sc] = color;
        while(!q.isEmpty()) {
            int[] rc = q.poll();

//            int r = rc[0];
//            int c = rc[1];

            for(int[] dir: dirs) {
                int r = rc[0] + dir[0];
                int c = rc[1] + dir[1];

                if(r >= 0 && r < n && c >= 0 && c < m && image[r][c] == initialColor) {
                    image[r][c] = color;
                    q.offer(new int[] { r, c });
                }
            }

//            if(c > 0 && image[r][c-1] == initialColor) {
//                image[r][c-1] = color;
//                q.offer(new int[] { r, c-1 });
//            }
//
//            if(c < m-1 && image[r][c+1] == initialColor) {
//                image[r][c+1] = color;
//                q.offer(new int[] { r, c+1 });
//            }
//
//            if(r > 0 && image[r-1][c] == initialColor) {
//                image[r-1][c] = color;
//                q.offer(new int[] { r-1, c });
//            }
//
//            if(r < n-1 && image[r+1][c] == initialColor) {
//                image[r+1][c] = color;
//                q.offer(new int[] { r+1, c });
//            }
        }

        return image;
    }
}