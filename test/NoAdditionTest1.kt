import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NoAdditionTest1 {

    @Test
    fun testNoAddition() {
        assertEquals(-4, noPlusFunction(-7, 3));
    }
}