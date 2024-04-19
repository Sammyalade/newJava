import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MaxMinusMinTest {

    @Test
    public void testMaxMinusMin() {
        assertArrayEquals(new int[]{5}, MaxMinusMin.findMedian(2,4,5,7,3));
        assertArrayEquals(new int[]{8}, MaxMinusMin.findMedian(2,1,3,4,9));

    }
}
