import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegexExerciseTest {

    @Test
    public void test() {
        assertTrue(RegexExercise.validatePhoneNumber("09071233456"));
    }

    @Test
    public void test2() {
        assertTrue(RegexExercise.validatePhoneNumber("9071233456"));
    }
}
