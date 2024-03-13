import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinMaxTest {

    @Test
    public void testMinMax() throws Exception {
        assertEquals("[10, 14]", MinMax.returnMinMax(1, 3, 5, 4, 2));
    }
}
