package com.adnan.striver.graphs;

import java.util.ArrayDeque;
import java.util.Deque;

// LeetCode 994: MEDIUM
// https://leetcode.com/problems/rotting-oranges/

// Approach: We use level order traversal to count the levels which are minutes in this case
// Our starting nodes are rotten oranges and children are fresh oranges that will be turned
// into rotten oranges. We also need to keep track of fresh oranges to handle the edge cases.
// We add all the rotten oranges coords into the bfs queue. We then use level order traversal
// to go minute by minute and if at any point we encounter that we are out of fresh oranges
// we stop the search. At the end if we know that there are 0 fresh oranges left we return
// the minute took otherwise it means it's impossible to turn all the fresh oranges to rotten oranges.

public class RottingOranges {

    // Time Complexity: O(M * N) ~ O(N^2)
    // Space Complexity: O(M * N) ~ O(N^2)
    public int orangesRotting(int[][] grid) {
        int m = grid[0].length;
        int n = grid.length;
        Deque<int[]> q = new ArrayDeque<>();

        int fresh = 0;
        for(int row = 0; row < n; row++) {
            for(int col = 0; col < m; col++) {
                if(grid[row][col] == 2) {
                    q.offer(new int[] { row, col });
                } else if(grid[row][col] == 1) {
                    fresh++;
                }
            }
        }

        if(fresh == 0)
            return 0;

        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        int minute = 0;
        while(!q.isEmpty() && fresh > 0) {
            int width = q.size();

            while(width-- > 0) {
                int[] rc = q.poll();

                for(int[] dir: dirs) {
                    int row = rc[0] + dir[0];
                    int col = rc[1] + dir[1];

                    if(row >= 0 && row < n && col >= 0 && col < m && grid[row][col] == 1) {
                        fresh--;
                        grid[row][col] = 2;
                        q.offer(new int[] { row, col });
                    }
                }

//                if(c > 0 && grid[r][c-1] == 1) {
//                    grid[r][c-1] = 2;
//                    fresh--;
//                    q.offer(new int[] { r, c-1 });
//                }
//
//                if(c < m-1 && grid[r][c+1] == 1) {
//                    grid[r][c+1] = 2;
//                    fresh--;
//                    q.offer(new int[] { r, c+1 });
//                }
//
//                if(r > 0 && grid[r-1][c] == 1) {
//                    grid[r-1][c] = 2;
//                    fresh--;
//                    q.offer(new int[] { r-1, c });
//                }
//
//                if(r < n-1 && grid[r+1][c] == 1) {
//                    grid[r+1][c] = 2;
//                    fresh--;
//                    q.offer(new int[] { r+1, c });
//                }
            }

            minute++;
        }

        return fresh == 0 ? minute : -1;
    }
}