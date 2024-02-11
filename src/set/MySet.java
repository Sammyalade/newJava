package set;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MySet {

    private int countOfElement;
    private int[] elementContainer = {};
    public boolean isEmpty() {
        return countOfElement == 0;
    }

    public void add(int elementToAdd) {

        if (countOfElement == 0){
            createOneMoreContainer();
            elementContainer[countOfElement-1] = elementToAdd;
        } else
        if (!contains(elementToAdd)) {
            createOneMoreContainer();
            elementContainer[countOfElement-1] = elementToAdd;
        }
    }

    public void addAll(int... elements) {
        for (int element : elements) {
            add(element);
        }
    }


    public int size() {
        return countOfElement;
    }

    public void remove(int elementToRemove) {
        if (countOfElement == 0){
            throw new NoSuchElementException("Set is Empty");
        }
        countOfElement--;
    }

    public void clear() {
        countOfElement = 0;
    }

    public boolean contains(int elementToCheck) {
        if (countOfElement == 0) {
            throw new NoSuchElementException("Set is empty");
        }
        for (int index = 0; index < countOfElement; index++) {
            if (elementContainer[index] == elementToCheck) {
                return true;
            }
        }
        return false;
    }


    public void createOneMoreContainer() {
        int[] temporary = new int[countOfElement + 1];
        for (int element = 0; element < countOfElement; element++) {
            temporary[element] = elementContainer[element];
        }
        elementContainer = temporary;
        countOfElement++;
    }

    @Override
    public String toString(){
        String concatenate = "";
        for(int count = 0; count < countOfElement; count++){
            if(count != countOfElement-1){
                concatenate += Integer.parseInt(String.valueOf(elementContainer[count])) + "," + " ";
            } else {
                concatenate += Integer.parseInt(String.valueOf(elementContainer[count]));
            }
        }
        return String.format("(%s)", concatenate);
    }

}
