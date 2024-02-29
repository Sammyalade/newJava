public class SevenSegmentDisplay {

    private final int switches;

    public SevenSegmentDisplay(int switches){
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

    public void verticalSwitch(int switch1, int switch2){
        if (switch1 == 1 && switch2 == 1) verticalPrintLeftAndRight();
        else if (switch1 == 0 && switch2 == 1) verticalPrintLeft();
        else if (switch1 == 1 && switch2 == 0) verticalPrintRight();
    }

    public void checkHorizontalSwitchToPrint(int switch1){
        if (switch1
    }

}
