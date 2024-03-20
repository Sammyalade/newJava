package fireDrill;

import java.util.Arrays;

public class HighestOccuringNumber {

    public static void main(String[] args) {
        checkForMode(1, 2, 2, 3, 4, 2);
        checkForMode(2, 3, 3, 5, 6, 7);
    }

    public static String checkForMode(int... numbers){
        int modeChecker = 0;
        int[] mode = new int[2];
        return Arrays.toString(iterateThrough(numbers, modeChecker, mode));
    }

    private static int[] iterateThrough(int[] numbers, int modeChecker, int[] mode) {
        for(int index = 0; index < numbers.length; index++){
            modeChecker = 0;
            modeChecker = innerLoop(numbers, index, modeChecker);
            checkForHighestAfterEveryLoop(numbers, modeChecker, mode, index);
        }
        return mode;
    }

    private static int innerLoop(int[] numbers, int index, int modeChecker) {
        for(int number : numbers){
            if (number == numbers[index]){
                modeChecker +=1;
            }
        }
        return modeChecker;
    }

    private static void checkForHighestAfterEveryLoop(int[] numbers, int modeChecker, int[] mode, int index) {
        if(modeChecker > mode[0]){
            mode[1] = numbers[index];
            mode[0] = modeChecker;
        }
    }

}
