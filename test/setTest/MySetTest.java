package setTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import set.MySet;

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
    public void test
}
