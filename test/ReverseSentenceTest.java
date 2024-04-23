import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ReverseSentenceTest {

    @Test
    public void testReverseSentence() {
        String reversed = ReverseSentence.reverseSentence("Hello World");
        System.out.println(reversed);
        assertThat(reversed, is("World Hello"));
    }
}
