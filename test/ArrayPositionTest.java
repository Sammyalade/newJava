import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ArrayPositionTest {


    @Test
    public void test() {
        int[] result = ArrayPosition.position(new int[]{10, 8, 9, 3});
        System.out.println(Arrays.toString(result));
        assertThat(result, is(new int[]{4, 2, 3, 1}));
    }
}
