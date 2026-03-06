package striver.strings.medium;

import com.adnan.striver.strings.medium.SortCharactersByFrequency;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortCharactersByFrequencyTest {

    private final SortCharactersByFrequency sortCharactersByFrequency = new SortCharactersByFrequency();

    @Test
    void test1() {
        String s = "tree";
        String output = "eert";

        String result = sortCharactersByFrequency.frequencySort(s);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        String s = "cccaaa";
        String output = "aaaccc";

        String result = sortCharactersByFrequency.frequencySort(s);

        assertEquals(output, result);
    }

    @Test
    void test3() {
        String s = "Aabb";
        String output = "bbAa";

        String result = sortCharactersByFrequency.frequencySort(s);

        assertEquals(output, result);
    }

}