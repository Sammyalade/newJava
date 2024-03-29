package sixGeoPoliticalZone;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static sixGeoPoliticalZone.SixGeoPoliticalZone.*;

public class SixGeoPoliticalZoneTest {

    private SixGeoPoliticalZoneChecker checker;

    @BeforeEach
    public void initializeChecker(){
        checker = new SixGeoPoliticalZoneChecker();
    }

    @Test
    public void checkForGeoPoliticalZoneOfAState_functionReturnsTheZoneTest() throws Exception {
        assertEquals(NORTH_CENTRAL, checker.returnPoliticalZone("Benue"));

    }

    @Test
    public void checkForGeoPoliticalZoneOfAState_functionReturnsTheZoneTest2() throws Exception {
        assertEquals(SOUTH_SOUTH, checker.returnPoliticalZone("Bayelsa"));

    }

    @Test
    public void checkForGeoPoliticalZoneOfAState_functionReturnsTheZoneTest3() throws Exception {
        assertEquals(SOUTH_EAST, checker.returnPoliticalZone("Abia"));

    }

    @Test
    public void checkForGeoPoliticalZoneOfAState_functionReturnsTheZoneTest4() throws Exception {
           assertNull(checker.returnPoliticalZone("Oshogbo"));

    }

}
