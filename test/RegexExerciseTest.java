import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegexExerciseTest {

    @Test
    public void test() {
        assertTrue(RegexExercise.validatePhoneNumber("09071233456"));
    }
}
