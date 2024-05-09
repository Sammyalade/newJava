import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class ArrayNumberOfOccurrenceTest {

    @Test
    public void testArrayNumberOfOccurrence() {
        HashMap<String, Integer> map = ArrayNumberOfOccurrence.returnNumberOfOccurrences(new int[]{1, 2, 2, 1, 3});
        System.out.println(map);
        assertEquals(2, (int) map.get("1"));
        assertEquals(2, (int) map.get("2"));
        assertEquals(1, (int) map.get("3"));
    }
}