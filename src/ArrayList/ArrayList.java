package ArrayList;

import java.util.Arrays;

public class ArrayList {

    private int countOfElements;
    private String[] temporary = {};

    private String[] elements = {};
    public boolean isEmpty() {
        return countOfElements == 0;
    }

    public void add(String element) {
        createOneMoreContainer();
        elements[countOfElements] = element;
        countOfElements++;
    }

    public void remove(String element) {
        if (countOfElements == 0) {
            throw new ArrayIndexOutOfBoundsException("ArrayList is Empty");
        }
        elements = deleteUnusedContainer(element);
        countOfElements--;
    }

    public int get(String element) {
        int count = 0;
        for(int index = 0; index < elements.length; index++){
            if(element.equals(elements[index]))
                count = index+1;
        }
        return count;
    }

    public String get(int index) {
        for (String element : elements) {
            if (elements[index-1].equals(element)) return element;
        }
        return null;
    }

    public int getSize() {
        return countOfElements;
    }

    public void insert(String element, int index) {
        if (elements[elements.length-1] != null){
            createOneMoreContainer();
        }
        if(elements[index-1] == null) {
            elements[index - 1] = element;
        } else {
            String temp = "";

            for (int indexOfElement = elements.length-1; indexOfElement > index-1 ; indexOfElement--){
                if(indexOfElement-1 != index -1){
                    temp = elements[indexOfElement-1];
                    elements[indexOfElement] = temp;
                    continue;
                } else {
                    temp = elements[indexOfElement-1];
                    elements[indexOfElement] = temp;
                    elements[index-1] = element;
                }


            }
        }
        countOfElements++;
        System.out.println(toString());

    }

    public void createOneMoreContainer(){
        temporary = new String[countOfElements+1];
        int count = 0;
        while (count < temporary.length-1) {
            temporary[count] = elements[count];
            count++;
        }
        elements = temporary;
    }

    public String display() {
        return String.format(Arrays.toString(elements));
    }

    @Override
    public String toString(){
        String concatenate = "";
        for(int count = 0; count < countOfElements; count++){
            if(count != countOfElements-1){
                concatenate += elements[count] + "," + " ";
            } else {
                concatenate += elements[count];
            }
        }
        return String.format("(%s)", concatenate);
    }

    public String[] deleteUnusedContainer(String element){
        String[] temp = new String[countOfElements-1];
        for (int count = 0; count < countOfElements-1; count++) {
            boolean isDuplicate = count != 0 && temp[count-1].equals(elements[count]);
            if (elements[count].equals(element)) {
                temp[count] = elements[count+1];
                continue;
            } else if(isDuplicate){
                temp[count] = elements[count+1];
            } else {
                temp[count] = elements[count];
            }
        }
        return  temp;
    }
}
