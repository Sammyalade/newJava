package floChecker;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FloCheckerTest {

    private FloCheckerTwo myFloChecker;

    @BeforeEach
    public void initializeMyFloChecker(){
        myFloChecker = new FloCheckerTwo();
    }

    @Test
    public void testCalculateNextPeriodDate() throws Exception {
        assertEquals(LocalDate.parse("2024-02-04"),  myFloChecker.calculateNextPeriodDate(LocalDate.parse("2024-01-07"),  28));
    }

    @Test
    public void testCalculateStartOfFertileWindow() throws Exception {
        assertEquals(LocalDate.parse("2024-01-18"), myFloChecker.calculateStartOfFertileWindow(LocalDate.parse("2024-01-07"), 31));
    }

    @Test
    public void testCalculateEndOfFertileWindow() throws Exception {
        assertEquals(LocalDate.parse("2024-01-25"), myFloChecker.calculateEndOfFertileWindow(LocalDate.parse("2024-01-07"), 31));
    }

    @Test
    public void testCalculateStartOfSafePeriod() throws Exception {
        assertEquals(LocalDate.parse("2024-01-15"), myFloChecker.calculateStartOfSafePeriod(LocalDate.parse("2024-01-07"), 7));

    }

    @Test
    public void testCalculateEndOfSafePeriod() throws Exception {
        assertEquals(LocalDate.parse("2024-01-17"), myFloChecker.calculateEndOfSafePeriod(LocalDate.parse("2024-01-07"), 31));
    }

    @Test
    public void testChangeDateFormat() throws Exception {
        assertEquals(LocalDate.parse("2024-01-15"), myFloChecker.changeDateFormat("2024-01-15"));
    }

    @Test
    public void testThatChangeDateFormatThrowsException() throws Exception {
        assertThrows(Exception.class,()-> myFloChecker.changeDateFormat("24/01/15"));
    }

    @Test
    public void testThatCalculateEndOfSafePeriodThrowsException() throws Exception {
        assertThrows(Exception.class,()-> myFloChecker.calculateEndOfSafePeriod(LocalDate.parse("aaaa-aa-aa"), 7));
    }

    @Test
    public void testThatCalculateStartOfSafePeriodThrowsException() throws Exception {
        assertThrows(Exception.class,()-> myFloChecker.calculateStartOfSafePeriod(LocalDate.parse("24-01-07"), 7));
    }

    @Test
    public void testThatCalculateEndOfFertileWindowThrowsException() throws Exception {
        assertThrows(Exception.class, ()->myFloChecker.calculateEndOfFertileWindow(LocalDate.parse("24-01-07"), 31));
    }

    @Test
    public void testThatCalculateStartOfFertileWindowThrowsException() throws Exception {
        assertThrows(Exception.class,()-> myFloChecker.calculateStartOfFertileWindow(LocalDate.parse("2024-017"), 31));
    }

    @Test
    public void testThatCalculateNextPeriodDateThrowsException() throws Exception {
        assertThrows(Exception.class,()->  myFloChecker.calculateNextPeriodDate(LocalDate.parse("20aaaaa1-07"),  28));
    }
}
