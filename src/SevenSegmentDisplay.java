import java.util.InputMismatchException;

public class SevenSegmentDisplay {

    private final String switches;

    public SevenSegmentDisplay(String switches){
        this.switches = switches;
    }

    public void horizontalPrint(){
        System.out.println("*  *  *  *");
    }

    public void verticalPrintLeft(){
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");
    }

    public void verticalPrintRight(){
        System.out.println("         *");
        System.out.println("         *");
        System.out.println("         *");
    }

    public void verticalPrintLeftAndRight(){
        System.out.println("*        *");
        System.out.println("*        *");
        System.out.println("*        *");
    }

    public void checkVerticalSwitchToPrint(int switch1, int switch2){
        if (switch1 == 1 && switch2 == 1) verticalPrintLeftAndRight();
        else if (switch1 == 0 && switch2 == 1) verticalPrintLeft();
        else if (switch1 == 1 && switch2 == 0) verticalPrintRight();
    }

    public void checkHorizontalSwitchToPrint(int switch1){
        if (switch1 == 1){
            horizontalPrint();
        }
    }

    public void switchOn() throws Exception {
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
    }

    private int[] putEntriesInAnArray(String switch1) throws Exception {
        int[] array = new int[switch1.length()];
        for (int index = 0; index < switch1.length(); index++) {
            array[index] = Character.getNumericValue(switch1.charAt(index));
            if(array[index] > 1 || array[index] < 0){
                throw new InputMismatchException("Enter only 0s and 1s");
            }
            if (index > 7){
                throw new Exception("Input should not be more than 8");
            }
        }
        return array;
    }

}
