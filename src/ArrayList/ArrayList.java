package ArrayList;

import java.util.Objects;

public class ArrayList {

    private int countOfElements;
    private final String[] elements = new String[3];
    public boolean isEmpty() {
        return countOfElements == 0;
    }

    public void add(String element) {
        elements[countOfElements] = element;
        countOfElements++;
    }

    public void remove(String element) {
        if (countOfElements == 0){
            throw new ArrayIndexOutOfBoundsException("ArrayList is Empty");
        }
        countOfElements--;
    }

    public int get(String element) {
        int count = 0;
        for (int index = 0; index < elements.length; index++) {
            if (elements[index].equals(element)) {
                count = index;
            }
        }
        return count;
    }
}
