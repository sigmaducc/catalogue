package leetcode.daily_coding_challenge._2026.may.jump_game_7;

import com.adnan.leetcode.daily_coding_challenge._2026.may.JumpGame7_25May2026;
import org.junit.jupiter.api.Test;
import test_utils.InputUtil;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JumpGame7_25May2026Test {

    private final JumpGame7_25May2026 jumpGame7 = new JumpGame7_25May2026();

    @Test
    void test1() {
        String s = "011010";
        int minJump = 2;
        int maxJump = 3;

        boolean result = jumpGame7.canReach(s, minJump, maxJump);

        assertTrue(result);
    }

    @Test
    void test2() {
        String s = "01101110";
        int minJump = 2;
        int maxJump = 3;

        boolean result = jumpGame7.canReach(s, minJump, maxJump);

        assertFalse(result);
    }

    @Test
    void test3() {
        String s = "01111111011110";
        int minJump = 1;
        int maxJump = 9;

        boolean result = jumpGame7.canReach(s, minJump, maxJump);

        assertTrue(result);
    }

    @Test
    void test4() {
        String s = InputUtil.readLine("src/test/java/leetcode/daily_coding_challenge/jump_game_7/input.txt");
        int minJump = 5;
        int maxJump = 99998;

        boolean result = jumpGame7.canReach(s, minJump, maxJump);

        assertTrue(result);
    }

}