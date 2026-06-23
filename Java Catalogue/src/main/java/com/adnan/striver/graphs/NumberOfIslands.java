package com.adnan.striver.graphs;

// LeetCode 200: MEDIUM
// https://leetcode.com/problems/number-of-islands/

// Approach: Simple DFS traversal from each 1 and using visited array to know the connected components.

public class NumberOfIslands {

    // Time Complexity: O(N * M)
    // Space Complexity: O(N * M)
    public int numIslands(char[][] grid) {
        int m = grid[0].length;
        int n = grid.length;
//        boolean[][] visited = new boolean[n][m];

        int count = 0;
        for(int row = 0; row < n; row++) {
            for(int col = 0; col < m; col++) {
//                if(grid[row][col] == '1' && !visited[row][col]) {
                if(grid[row][col] == '1') {
                    count++;
                    dfs(row, col, grid);
                }
            }
        }

        return count;
    }

    private void dfs(int row, int col, char[][] grid) {
        if(row < 0 || row >= grid.length || col < 0 || col >= grid[0].length) return;
//        if(visited[row][col]) return;
        if(grid[row][col] != '1') return;

//        visited[row][col] = true;
        grid[row][col] = '#';
        dfs(row, col-1, grid);
        dfs(row, col+1, grid);
        dfs(row-1, col, grid);
        dfs(row+1, col, grid);
    }

}