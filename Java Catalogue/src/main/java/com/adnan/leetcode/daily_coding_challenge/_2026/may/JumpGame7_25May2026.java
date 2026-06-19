package com.adnan.leetcode.daily_coding_challenge._2026.may;

import java.util.ArrayDeque;
import java.util.Deque;

public class JumpGame7_25May2026 {

    public boolean canReach(String s, int minJump, int maxJump) {
        int n = s.length();
        boolean[] visited = new boolean[n];
        Deque<Integer> q = new ArrayDeque<>();

        int far = 0;
        q.offer(0);
        visited[0] = true;
        while(!q.isEmpty()) {
            int idx = q.poll();

            if(idx == n - 1) return true;

            int min = Math.max(idx + minJump, far + 1);
            int max = Math.min(idx + maxJump, n - 1);

            for(int i = min; i <= max; i++) {
                if(visited[i]) continue;
                if(s.charAt(i) == '1') continue;

                q.offer(i);
                visited[i] = true;
            }

            far = max;
        }

        return false;
    }

}