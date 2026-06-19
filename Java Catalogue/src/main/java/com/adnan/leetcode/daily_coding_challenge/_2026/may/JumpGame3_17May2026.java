package com.adnan.leetcode.daily_coding_challenge._2026.may;

import java.util.ArrayDeque;
import java.util.Deque;

public class JumpGame3_17May2026 {

    public boolean canReach(int[] arr, int start) {
        if(arr.length == 0 || start > arr.length - 1)
            return false;

        boolean[] visited = new boolean[arr.length];

        Deque<Integer> q = new ArrayDeque<>();
        q.offer(start);
        visited[start] = true;
        while(!q.isEmpty()) {
            Integer index = q.poll();

            if(arr[index] == 0) return true;

            int left = index - arr[index];
            int right = index + arr[index];

            if(0 <= left && left <= arr.length - 1 && !visited[left]) {
                q.offer(left);
                visited[left] = true;
            }

            if(0 <= right && right <= arr.length - 1 && !visited[right]) {
                q.offer(right);
                visited[right] = true;
            }
        }

        return false;
    }
}