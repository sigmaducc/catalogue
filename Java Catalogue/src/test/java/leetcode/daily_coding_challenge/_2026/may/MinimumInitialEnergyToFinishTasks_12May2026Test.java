package leetcode.daily_coding_challenge._2026.may;

import com.adnan.leetcode.daily_coding_challenge._2026.may.MinimumInitialEnergyToFinishTasks_12May2026;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumInitialEnergyToFinishTasks_12May2026Test {

    private final MinimumInitialEnergyToFinishTasks_12May2026 minimumInitialEnergyToFinishTasks = new MinimumInitialEnergyToFinishTasks_12May2026();

    @Test
    void test1() {
        int[][] tasks = {{1,2},{2,4},{4,8}};
        int output = 8;
        
        int result = minimumInitialEnergyToFinishTasks.minimumEffort(tasks);
        
        assertEquals(output, result);
    }

    @Test
    void test2() {
        int[][] tasks = {{1,3},{2,4},{10,11},{10,12},{8,9}};
        int output = 32;

        int result = minimumInitialEnergyToFinishTasks.minimumEffort(tasks);

        assertEquals(output, result);
    }
    
    @Test
    void test3() {
        int[][] tasks = {{1,7},{2,8},{3,9},{4,10},{5,11},{6,12}};
        int output = 27;

        int result = minimumInitialEnergyToFinishTasks.minimumEffort(tasks);

        assertEquals(output, result);
    }

    @Test
    void test4() {
        int[][] tasks = {{1,1},{1,3}};
        int output = 3;

        int result = minimumInitialEnergyToFinishTasks.minimumEffort(tasks);

        assertEquals(output, result);
    }

    @Test
    void test5() {
        int[][] tasks = {{1,2},{1,7},{2,3},{5,9},{2,2}};
        int output = 11;

        int result = minimumInitialEnergyToFinishTasks.minimumEffort(tasks);

        assertEquals(output, result);
    }

}