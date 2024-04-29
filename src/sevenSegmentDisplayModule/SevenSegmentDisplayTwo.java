package sevenSegmentDisplayModule;

import java.util.InputMismatchException;

public class SevenSegmentDisplayTwo {

    private final String switches;

    public SevenSegmentDisplayTwo(String switches) {
        this.switches = switches;
    }

    public String horizontalPrint(){
        return "*  *  *  *";
    }

    public String verticalPrintLeft(){
       return """
               *
               *
               *""";
    }

    public String verticalPrintRight(){
       return """
              .           *
              .           *
              .           *
                         """;
    }

    public String verticalPrintLeftAndRight(){
        return """
             *          *
             *          *
             *          *
                         """;
    }

    private void checkVerticalSwitchToPrint(int switch1, int switch2){
        if (switch1 == 1 && switch2 == 1) verticalPrintLeftAndRight();
        else if (switch1 == 0 && switch2 == 1) verticalPrintLeft();
        else if (switch1 == 1 && switch2 == 0) verticalPrintRight();
    }

    private void checkHorizontalSwitchToPrint(int switch1){
        if (switch1 == 1){
            horizontalPrint();
        }
    }

    public boolean switchOn() {
        int[] entries = putEntriesInAnArray(switches);
        if (entries[7] == 1){
            checkHorizontalSwitchToPrint(entries[0]);
            checkVerticalSwitchToPrint(entries[1], entries[5]);
            checkHorizontalSwitchToPrint(entries[6]);
            checkVerticalSwitchToPrint(entries[2], entries[4]);
            checkHorizontalSwitchToPrint(entries[3]);
        } else {
            System.out.println("Main switch is off");
        }
        return false;
    }

    private int[] putEntriesInAnArray(String switch1) {
        int[] array = new int[switch1.length()];
        for (int index = 0; index < switch1.length(); index++) {
            array[index] = Character.getNumericValue(switch1.charAt(index));
            if(array[index] > 1 || array[index] < 0){
                throw new InputMismatchException("Input at " + (index+1) + " is greater than 1 or less than 0");
            }
            if (index > 7){
                throw new RuntimeException("Input should not be more than 8");
            }
        }
        return array;
    }
}
