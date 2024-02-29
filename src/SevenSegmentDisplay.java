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
        System.out.println("        *");
        System.out.println("        *");
        System.out.println("        *");
    }

    public void verticalPrintLeftAndRight(){
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("*       *");
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
            checkHorizontalSwitchToPrint(6);
            checkVerticalSwitchToPrint(entries[3], entries[5]);
        } else {
            System.out.println("Main switch is off");
        }
    }

    private int[] putEntriesInAnArray(String switch1) throws Exception {
        int[] array = new int[switch1.length()];
        for (int index = 0; index < switch1.length(); index++) {
            array[index] = Character.getNumericValue(switch1.charAt(index));
            if (index > 8){
                throw new Exception("Input should not be more than 8");
            }
        }
        return array;
    }

}
