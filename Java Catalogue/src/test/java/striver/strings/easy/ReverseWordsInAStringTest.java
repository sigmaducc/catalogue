package striver.strings.easy;

import com.adnan.striver.strings.easy.ReverseWordsInAString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseWordsInAStringTest {

    @Test
    void test1() {
        String s = "the  sky is blue";
        String output = "blue is sky the";

        String result = new ReverseWordsInAString().reverseWords(s);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        String s = "  hello world  ";
        String output = "world hello";

        String result = new ReverseWordsInAString().reverseWords(s);

        assertEquals(output, result);
    }

    @Test
    void test3() {
        String s = "a good   example";
        String output = "example good a";

        String result = new ReverseWordsInAString().reverseWords(s);

        assertEquals(output, result);
    }

    @Test
    void test4() {
        String s = "the  sky";
        String output = "sky the";

        String result = new ReverseWordsInAString().reverseWords(s);

        assertEquals(output, result);
    }

    @Test
    void test5() {
        String s = "the sky is blue";
        String output = "blue is sky the";

        String result = new ReverseWordsInAString().reverseWords(s);

        assertEquals(output, result);
    }

}