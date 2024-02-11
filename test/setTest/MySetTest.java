package setTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import set.MySet;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class MySetTest {
    private MySet mySet;

    @BeforeEach
    public void initializeMySet(){
        mySet = new MySet();
    }
    @Test
    public void testThatSetIsEmpty(){
        assertTrue(mySet.isEmpty());
    }

    @Test
    public void addOneElementToSet_itemSuccessfullyAddedTest(){
        mySet.add(10);
        assertFalse(mySet.isEmpty());
    }

    @Test
    public void testThatSetCanAddMoreThanOneElementAtTheSameTime(){
        mySet.addAll(10, 20, 30, 40, 50);
        assertEquals(5, mySet.size());
    }

    @Test
    public void testThatSetCanRemoveItem(){
        mySet.addAll(10, 20, 30, 40, 50);
        mySet.remove(10);
        assertEquals(4, mySet.size());
    }

    @Test
    public void testThatAllElementInCanBeCleared(){
        mySet.addAll(10, 20, 30, 40, 50);
        mySet.clear();
        assertTrue(mySet.isEmpty());
    }

    @Test
    public void checkIfElementIsPresentedInASet_elementIsPresent(){
        mySet.addAll(10, 20, 30, 40, 50);
        assertTrue(mySet.contains(20));
        assertFalse(mySet.contains(100));
    }

    @Test
    public void checkForElementWhenTheSetIsEmpty_throwException(){
        assertTrue(mySet.isEmpty());
        assertThrows(NoSuchElementException.class,() ->mySet.contains(100));

    }

    @Test
    public void removeElementWhenSetIsEmpty_throwsException(){
        assertTrue(mySet.isEmpty());
        assertThrows(NoSuchElementException.class, () -> mySet.remove(100));
    }

    @Test
    public void saveDuplicateElement_elementSizeRemainUnchanged(){
        mySet.addAll(10, 20, 30, 40, 50);
        mySet.add(10);
        assertEquals(5, mySet.size());
    }

    @Test
    public void testThatSetCanPrintToString(){
        mySet.addAll(10, 20, 30, 40, 50);
        assertEquals("(10, 20, 30, 40, 50)", mySet.toString());
    }
}
