package stack;

public class Stack {
    private int itemSize;
    private int[] itemContainer = {};
    private int[] temporary = {};

    public boolean isEmpty() {
        return itemSize == 0;
    }

    public void push(int elementToPush) {
        createOneMoreContainer();
        itemContainer[itemSize] = elementToPush;
        itemSize++;
    }

    public int getSize() {
        return itemSize;
    }

    public void pop() {
        itemSize--;
    }

    public int peek() {
        return itemContainer[itemSize-1];
    }

    public void createOneMoreContainer(){
        temporary = new int[itemSize+1];
        int count = 0;
        while (count < temporary.length-1) {
            temporary[count] = itemContainer[count];
            count++;
        }
        itemContainer = temporary;
    }
}
