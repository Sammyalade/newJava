package sevenSegmentDisplayModule;

import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SevenSegmentDisplayTest {

    @Test
    public void testHorizontalDisplay() {
        SevenSegmentDisplayTwo display = new SevenSegmentDisplayTwo("11110111");
        assertEquals("*  *  *  *", display.horizontalPrint());
    }

    @Test
    public void testVerticalPrintLeft() {
        SevenSegmentDisplayTwo display = new SevenSegmentDisplayTwo("11110111");
        String test = """
               *
               *
               *""";
        assertEquals(test, display.verticalPrintLeft());
    }

    @Test
    public void testVerticalPrintRight() {
        SevenSegmentDisplayTwo display = new SevenSegmentDisplayTwo("11110111");
        String test = """
              .           *
              .           *
              .           *
                         """;
        assertEquals(test, display.verticalPrintRight());
    }

    @Test
    public void testVerticalPrintLeftAndRight() {
        SevenSegmentDisplayTwo display = new SevenSegmentDisplayTwo("11110111");
        String test = """
             *          *
             *          *
             *          *
                         """;
        assertEquals(test, display.verticalPrintLeftAndRight());
    }

    @Test
    public void testInvalidInput(){
        SevenSegmentDisplayTwo display = new SevenSegmentDisplayTwo("21110111");
        assertThrows(InputMismatchException.class, display::switchOn);

    }

    @Test
    public void testMoreThan8Input(){
        SevenSegmentDisplayTwo display = new SevenSegmentDisplayTwo("1111110111");
        assertThrows(RuntimeException.class, display::switchOn);

    }
}
