package stack;

import javax.annotation.processing.SupportedAnnotationTypes;
import java.util.Arrays;

public class Stack {
    private int itemSize;
    private int[] itemContainer;

    public Stack(int stackSize) {
        itemContainer = new int[stackSize];
    }

    public boolean isEmpty() {
        return itemSize == 0;
    }

    public void push(int elementToPush) {
        if (itemSize == itemContainer.length){
            throw new StackOverflowError("Stack is full");
        }
        itemContainer[itemSize] = elementToPush;
        itemSize++;
    }

    public int getSize() {
        return itemSize;
    }

    public void pop() {
        if(itemSize == 0){
            throw new IllegalArgumentException("Stack is Empty");
        }
        removeLastInOnStack();
        itemSize--;
    }

    public int peek() {
        return itemContainer[itemSize-1];
    }


    public int search(int itemToSearch) {
        for(int index = 0; index < itemContainer.length; index++){
            if (itemContainer[index] == itemToSearch){
                return index+1;
            }
        }
        return -1;
    }

    public void removeLastInOnStack(){
        int[] temporary = new int[itemSize - 1];
        for (int index = 0; index < temporary.length; index++){
            temporary[index] = itemContainer[index];
        }
        itemContainer = temporary;
    }


}
