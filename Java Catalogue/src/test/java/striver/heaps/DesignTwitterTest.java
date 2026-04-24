package striver.heaps;

import com.adnan.striver.heaps.DesignTwitter;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class DesignTwitterTest {

    private DesignTwitter designTwitter;

    @Test
    void test1() {
        String[] operations = {"Twitter", "postTweet", "getNewsFeed", "follow", "postTweet", "getNewsFeed", "unfollow", "getNewsFeed"};
        int[][] args = { {}, {1, 5}, {1}, {1, 2}, {2, 6}, {1}, {1, 2}, {1} };
        Object[] expected = { null, null, List.of(5), null, null, List.of(6, 5), null, List.of(5) };

        for (int i = 0; i < operations.length; i++) {
            switch (operations[i]) {
                case "Twitter":
                    designTwitter = new DesignTwitter();
                    assertNull(expected[i]);
                    break;
                case "postTweet":
                    designTwitter.postTweet(args[i][0], args[i][1]);
                    assertNull(expected[i]);
                    break;
                case "follow":
                    designTwitter.follow(args[i][0], args[i][1]);
                    assertNull(expected[i]);
                    break;
                case "unfollow":
                    designTwitter.unfollow(args[i][0], args[i][1]);
                    assertNull(expected[i]);
                    break;
                case "getNewsFeed":
                    List<Integer> tweets = designTwitter.getNewsFeed(args[i][0]);
                    assertEquals(expected[i], tweets);
                    break;
            }
        }
    }

}