import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;;

public class FireDrillTest {

    @Test
    public void testThatArrayReturnsTrueForEvenAndFalseForOdd(){
        assertArrayEquals(new boolean[]{false, true, false, false, false, false, true},FireDrillSeven.returnTrueOrFalseArray(new int[]{4, 5, 8, 8, 8, 2, 9}));
    }
}
