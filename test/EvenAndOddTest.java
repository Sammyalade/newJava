import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenAndOddTest {


    @Test
    public void testCheckForEvenAndOddNumber(){
        assertEquals(0, EvenAndOdd.transformEvenToZeroAndOddToOne(2));
    }

    @Test
    public void testThatFunctionReturnsZeroForEvenAndOneForOdd(){
        assertArrayEquals(new int[]{0, 1, 0, 0, 0, 0, 1}, EvenAndOdd.returnArraysOfOneAndZerosForOddAndEvenNumber(new int[]{4, 5, 8, 8, 8, 2, 9}));
    }
}
