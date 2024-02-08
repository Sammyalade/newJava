import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestArrayDoubleTheLength {

    @Test
    public void doubleArrayLengthTest(){
        int[] arrays = {1, 2, 3, 4, 5};
        assertEquals(10, ArrayDoubleTheLength.doubleArrayLength(arrays).length);
    }

    @Test
    public void testThatFunctionReturnsDoubleTheLengthOfAnArray(){
        int[] array = {4,5,8};
        assertArrayEquals(new int[] {4, 5, 8, 8, 10, 16}, ArrayDoubleTheLength.doubleTheLengthOfInitialArray(array));
    }

    @Test
    public void testMultiplyTheArray(){
        int array = 4;
        assertEquals(8, ArrayDoubleTheLength.multiplyTheArray(array));
    }

}
