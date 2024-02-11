package stackTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import stack.Stack;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    Stack myStack;

    @BeforeEach
    public void initializeMyStack(){
        myStack = new Stack(4);
    }
    @Test
    public void checkIfStackIsEmpty_stackIsEmptyTest(){
        assertTrue(myStack.isEmpty());
    }

    @Test
    public void pushToMyStack_pushSuccessful(){
        assertTrue(myStack.isEmpty());
        myStack.push(50);
        assertEquals(1, myStack.getSize());
    }

    @Test
    public void pushTwoItemsToStack_itemsPushedSuccessfully(){
        assertTrue(myStack.isEmpty());
        myStack.push(50);
        myStack.push(40);
        assertEquals(2, myStack.getSize());
    }

    @Test
    public void popItemsFromStack_itemsPopSuccessfully(){
        assertTrue(myStack.isEmpty());
        myStack.push(50);
        myStack.push(40);
        myStack.pop();
        assertEquals(1, myStack.getSize());
    }

    @Test
    public void peekItem__returnsLastItemPushed(){
        assertTrue(myStack.isEmpty());
        myStack.push(50);
        myStack.push(40);
        assertEquals(40, myStack.peek());
    }

    @Test
    public void checkThatAfterPush_itemContainerIncreasedTest(){
        assertTrue(myStack.isEmpty());
        myStack.push(50);
        myStack.push(40);
        myStack.push(30);
        myStack.push(20);
        assertEquals(4, myStack.getSize());
    }

    @Test
    public void popLastItemCheckItem_itemEqualsToTheNextToLastTest(){
        myStack.push(50);
        myStack.push(40);
        myStack.push(30);
        myStack.pop();
        assertEquals(40, myStack.peek());
    }

    @Test
    public void searchForItemOnStack_returnsPositionOfItemOnStack(){
        myStack.push(50);
        myStack.push(40);
        myStack.push(30);
        assertEquals(2, myStack.search(40));
    }

    @Test
    public void popAnItemAndSearchForIt_searchReturnsMinusOne(){
        myStack.push(50);
        myStack.push(40);
        myStack.push(30);
        myStack.pop();
        assertEquals(-1, myStack.search(30));
    }

    @Test
    public void popAnItemAndSearchForTheNextItem_searchReturnsOne(){
        myStack.push(50);
        myStack.push(40);
        myStack.push(30);
        myStack.pop();
        assertEquals(2, myStack.search(40));
    }

    @Test
    public void popAnEmptyStack_throwsAnException(){
        assertThrows(IllegalArgumentException.class, ()-> myStack.pop());

    }

    @Test
    public void pushMoreThanTheStackSize_throwStackOverFlowException(){
        myStack.push(50);
        myStack.push(40);
        myStack.push(30);
        myStack.push(20);
        assertThrows(StackOverflowError.class, () -> myStack.push(10));
    }


}
