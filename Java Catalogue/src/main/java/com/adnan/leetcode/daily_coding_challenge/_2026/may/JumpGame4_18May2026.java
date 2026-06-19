package com.adnan.leetcode.daily_coding_challenge._2026.may;

import java.util.*;

public class JumpGame4_18May2026 {

    public int minJumps(int[] arr) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        boolean[] visited = new boolean[arr.length];

        for(int i = 0; i <= arr.length - 1; i++) {
            map.computeIfAbsent(arr[i], k -> new ArrayList<>()).add(i);
        }

        int jumps = 0;
        Deque<Integer> q = new ArrayDeque<>();
        q.offer(0);
        visited[0] = true;
        while(!q.isEmpty()) {
            int width = q.size();

            while(width-- > 0) {
                int index = q.poll();

                if(index == arr.length - 1)
                    return jumps;

                int left = index - 1;
                int right = index + 1;

                if(left >= 0 && !visited[left]) {
                    q.offer(left);
                    visited[left] = true;
                }

                if(right <= arr.length - 1 && !visited[right]) {
                    q.offer(right);
                    visited[right] = true;
                }

                if(map.containsKey(arr[index])) {
                    for(Integer idx: map.get(arr[index])) {
                        if(idx == index) continue;
                        if(visited[idx]) continue;

                        q.offer(idx);
                        visited[idx] = true;
                    }

                    map.remove(arr[index]);
                }
            }

            jumps++;
        }

        return -1;
    }
}