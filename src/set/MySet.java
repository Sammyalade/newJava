package set;

public class MySet {

    private int countOfElement;
    public boolean isEmpty() {
        return countOfElement == 0;
    }

    public void add(int element) {
        countOfElement++;
    }

    public void addAll(int... element) {
        countOfElement += element.length;
    }

    public int size() {
        return countOfElement;
    }

    public void remove(int i) {
        countOfElement--;
    }

    public void clear() {
        countOfElement = 0;
    }
}
