package com.adnan.striver.graphs;

import java.util.ArrayDeque;
import java.util.Deque;

// LeetCode 547: MEDIUM
// https://leetcode.com/problems/number-of-provinces/

// Approach: Use the given adjacency matrix to iterate over all the nodes and
// their edges with other nodes. Basically the problem is to count the connected
// components of a graph.

public class NumberOfProvinces {

    // Time Complexity: O(N * N)
    // Space Complexity: O(N)
    public int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length];

        int count = 0;
        for(int i = 0; i < isConnected.length; i++) {
            if(!visited[i]) {
                dfs(i, visited, isConnected);
                count++;
            }
        }

        return count;
    }

    private void dfs(int i, boolean[] visited, int[][] isConnected) {
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(i);
        visited[i] = true;
        while(!stack.isEmpty()) {
            int index = stack.pop();

            for(int e = 0; e < isConnected.length; e++) {
                if(isConnected[index][e] == 1 && !visited[e]) {
                    stack.push(e);
                    visited[e] = true;
                }
            }
        }
    }

//    private void dfs(int i, boolean[] visited, int[][] isConnected) {
//        if(visited[i]) return;
//
//        visited[i] = true;
//        for(int e = 0; e < isConnected.length; e++) {
//            if(isConnected[i][e] == 1)
//                dfs(e, visited, isConnected);
//        }
//    }
}