package interviews.disney.oa;

import com.adnan.interviews.disney.oa.DisneyAnimationStudioJobScheduling;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DisneyAnimationStudioJobSchedulingTest {

    private final DisneyAnimationStudioJobScheduling disneyAnimationStudioJobScheduling = new DisneyAnimationStudioJobScheduling();

    @Test
    void test1() {
        int n = 5;
        int m = 11;
        int k = 5;
        int output = 4;

        int result = disneyAnimationStudioJobScheduling.getMaximumJobs(n, m , k);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        int n = 5;
        int m = 16;
        int k = 2;
        int output = 4;

        int result = disneyAnimationStudioJobScheduling.getMaximumJobs(n, m , k);

        assertEquals(output, result);
    }

}