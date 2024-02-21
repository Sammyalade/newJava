import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgeCheckerTest {

    @Test
    public void testAge(){
        assertEquals(28, AgeChecker.checkBirthDate("29/12/1995"));
    }
}
