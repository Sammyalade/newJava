package ArrayListTest;

import arrayList.ArrayList;
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
    public void addTwoElementsAndRemoveOne_listIsEmptyTest(){
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
        assertEquals(1, string. get("Django"));
    }

    @Test
    public void addOneElement_getByIndexTest(){
        assertTrue(string.isEmpty());
        string.add("Django");
        assertEquals("Django", string.get(1));
    }

    @Test
    public void getListSize_listReturnsSize(){
        string.add("Django");
        string.add("Python");
        string.add("Ruby");
        assertEquals(3, string.getSize());
    }

    @Test
    public void insertItemInAList_itemInsertSuccessfully(){
        string.add("Java");
        string.add("Kotlin");
        string.add("Ruby");
        string.insert("Django", 3);
        assertEquals(1, string.get("Java"));
        assertEquals(2, string.get("Kotlin"));
        assertEquals(3 , string.get("Django"));
        assertEquals(4 , string.get("Ruby"));

    }

    @Test
    public void testThatContainerSizeCanIncrease(){
        string.add("Java");
        string.add("C++");
        string.add("Python");
        string.add("Kotlin");
        assertEquals(2, string.get("C++"));
    }

    @Test
    public void displayAllElementInArrayListTest(){
        string.add("Java");
        string.add("C++");
        string.add("Python");
        string.add("Kotlin");
        assertEquals("[Java, C++, Python, Kotlin]", string.display());
    }

    @Test
    public void testThatArrayListToStringMethod(){
        string.add("Java");
        string.add("C++");
        string.add("Python");
        string.add("Kotlin");
        assertEquals("(Java, C++, Python, Kotlin)", string.toString());
    }

    @Test
    public void removeAnItem_checkThatTheContainerReducedTest(){
        string.add("Java");
        string.add("C++");
        string.add("Python");
        string.add("Kotlin");
        string.remove("Java");
        assertEquals("(C++, Python, Kotlin)", string.toString());
    }

}
