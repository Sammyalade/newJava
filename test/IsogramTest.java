import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsogramTest {

    @Test
    public void testIsogram() {
        String tester = "The quick brown fox jumps over the lazy dog";
        Assertions.assertTrue(Isogram.checkIsogram(tester));
    }
}
