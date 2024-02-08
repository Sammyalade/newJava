package ArrayListTest;

import ArrayList.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ArrayListTest {
    private ArrayList string;

    @BeforeEach
    public void initializeArrayList(){
        string = new ArrayList();
    }
    @Test
    public void newArrayListIsEmptyTest(){
        assertTrue(string.isEmpty());
    }

    @Test
    public void addOneElementToEmptyList_listNotEmptyTest(){
        assertTrue(string.isEmpty());
        string.add("Django");
        assertFalse(string.isEmpty());
    }

    @Test
    public void addOneElementAndRemoveOneElement_listIsEmptyTest(){
        assertTrue(string.isEmpty());
        string.add("Django");
        string.remove("Django");
        assertTrue(string.isEmpty());
    }

    @Test
    public void addTowElementsAndRemoveOne_listIsEmptyTest(){
        assertTrue(string.isEmpty());
        string.add("Django");
        string.add("Python");
        assertFalse(string.isEmpty());
        string.remove("Django");
        assertFalse(string.isEmpty());
    }

    @Test
    public void removeElementFromEmptyList_listThrowsExceptionTest(){
        assertTrue(string.isEmpty());
        assertThrows(ArrayIndexOutOfBoundsException.class, ()-> string.remove("Python"));

    }

    @Test
    public void addOneElement_getByIndexByElement(){
        assertTrue(string.isEmpty());
        string.add("Django");
        assertFalse(string.isEmpty());
        assertEquals(1, string.get("Django"));
    }

}
