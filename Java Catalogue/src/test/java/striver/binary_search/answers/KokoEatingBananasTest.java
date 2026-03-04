package striver.binary_search.answers;

import com.adnan.striver.binary_search.answers.KokoEatingBananas;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KokoEatingBananasTest {

    @Test
    void test1() {
        int[] piles = {3,6,7,11};
        int h = 8;
        int output = 4;

        int result = new KokoEatingBananas().minEatingSpeed(piles, h);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        int[] piles = {30,11,23,4,20};
        int h = 5;
        int output = 30;

        int result = new KokoEatingBananas().minEatingSpeed(piles, h);

        assertEquals(output, result);
    }

    @Test
    void test3() {
        int[] piles = {30,11,23,4,20};
        int h = 6;
        int output = 23;

        int result = new KokoEatingBananas().minEatingSpeed(piles, h);

        assertEquals(output, result);
    }

    @Test
    void test4() {
        int[] piles = {3, 6, 7, 100, 1, 1, 1, 1, 1};
        int h = 10;
        int output = 50;

        int result = new KokoEatingBananas().minEatingSpeed(piles, h);

        assertEquals(output, result);
    }

    @Test
    void test5() {
        int[] piles = {1, 1, 1, 1, 1};
        int h = 5;
        int output = 1;

        int result = new KokoEatingBananas().minEatingSpeed(piles, h);

        assertEquals(output, result);
    }

    @Test
    void test6() {
        int[] piles = {10, 10, 10};
        int h = 3;
        int output = 10;

        int result = new KokoEatingBananas().minEatingSpeed(piles, h);

        assertEquals(output, result);
    }

    @Test
    void test7() {
        int[] piles = {1000000000};
        int h = 1;
        int output = 1000000000;

        int result = new KokoEatingBananas().minEatingSpeed(piles, h);

        assertEquals(output, result);
    }

    @Test
    void test8() {
        int[] piles = {312884470};
        int h = 312884469;
        int output = 2;

        int result = new KokoEatingBananas().minEatingSpeed(piles, h);

        assertEquals(output, result);
    }

    @Test
    void test9() {
        int[] piles = {805306368,805306368,805306368};
        int h = 1000000000;
        int output = 3;

        int result = new KokoEatingBananas().minEatingSpeed(piles, h);

        assertEquals(output, result);
    }

}