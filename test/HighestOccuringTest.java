import fireDrill.HighestOccuringNumber;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HighestOccuringTest {

    @Test
    public void testThatReturnMostOccuring(){
        assertEquals(Arrays.toString(new int[]{3, 2}),HighestOccuringNumber.checkForMode(1, 2, 2, 3, 4, 2));
        assertEquals(Arrays.toString(new int[]{2, 3}),HighestOccuringNumber.checkForMode(2, 3, 3, 5, 6, 7));
    }
}
