package wagesPerDay;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class WagesPerDayCalculatorTest {

    @Test
    public void testForGreaterThanSeventyPercent(){
        assertEquals(45_000,WagePerDayCalculator.returnWage(80));
    }
    @Test
    public void testForGreaterThanSixtyPercent(){
        assertEquals(20_000,WagePerDayCalculator.returnWage(60));
    }

    @Test
    public void testForGreaterThanFiftyPercent(){
        assertEquals(15_000,WagePerDayCalculator.returnWage(50));
    }

    @Test
    public void testForGreaterFortyThanPercent(){
        assertEquals(11_400,WagePerDayCalculator.returnWage(40));
    }

    @Test
    public void testForGreatThan100(){
        assertThrows(RuntimeException.class,()-> WagePerDayCalculator.returnWage(1000));
    }

    @Test
    public void testForLessThan0(){
        assertThrows(RuntimeException.class,()-> WagePerDayCalculator.returnWage(-1000));
    }
}
