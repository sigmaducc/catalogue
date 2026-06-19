package leetcode.daily_coding_challenge._2026.may.jump_game_4;

import com.adnan.leetcode.daily_coding_challenge._2026.may.JumpGame4_18May2026;
import org.junit.jupiter.api.Test;
import test_utils.InputUtil;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JumpGame4_18May2026Test {

    private final JumpGame4_18May2026 jumpGame4 = new JumpGame4_18May2026();

    @Test
    void test1() {
        int[] arr = {100,-23,-23,404,100,23,23,23,3,404};
        int output = 3;

        int result = jumpGame4.minJumps(arr);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        int[] arr = {7};
        int output = 0;

        int result = jumpGame4.minJumps(arr);

        assertEquals(output, result);
    }

    @Test
    void test3() {
        int[] arr = {7,6,9,6,9,6,9,7};
        int output = 1;

        int result = jumpGame4.minJumps(arr);

        assertEquals(output, result);
    }

    @Test
    void test4() {
        int[] arr = {7,6,9,6,9,6,9,7};
        int output = 1;

        int result = jumpGame4.minJumps(arr);

        assertEquals(output, result);
    }

    @Test
    void test5() {
        int[] arr = {7,7,2,1,7,7,7,3,4,1};
        int output = 3;

        int result = jumpGame4.minJumps(arr);

        assertEquals(output, result);
    }

    @Test
    void test6() {
        int[] arr = InputUtil.readIntArray("src/test/java/leetcode/daily_coding_challenge/jump_game_4/input.txt");
        int output = 2;

        int result = jumpGame4.minJumps(arr);

        assertEquals(output, result);
    }

}