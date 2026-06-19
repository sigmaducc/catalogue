package com.adnan.leetcode.daily_coding_challenge._2026.may;

import java.util.Arrays;

public class MinimumInitialEnergyToFinishTasks_12May2026 {

    public int minimumEffort(int[][] tasks) {
        Arrays.sort(tasks, (a, b) -> (b[1]-b[0]) - (a[1]-a[0]));

        int diff = 0; int total = 0;
        for(int i = 0; i <= tasks.length - 1; i++) {
            if(tasks[i][1] > diff) {
                total += tasks[i][1] - diff;
                diff = tasks[i][1] - tasks[i][0];
            } else {
                diff = diff - tasks[i][0];
            }
        }

        return total;
    }
}