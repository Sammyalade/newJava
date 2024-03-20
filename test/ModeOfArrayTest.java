import fireDrill.ModeOfArray;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ModeOfArrayTest {

    @Test
    public void testThatReturnMostOccuring(){
        assertEquals(Arrays.toString(new int[]{3, 2}), ModeOfArray.checkForMode(1, 2, 2, 3, 4, 2));
        assertEquals(Arrays.toString(new int[]{3, 3}), ModeOfArray.checkForMode(3, 3, 3, 5, 6, 7));
    }
}
