package fireDrill2;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner collector = new Scanner(System.in);
        int userInput = 0;
        int total = 0;
        for(int count = 1; count <= 10; count++){

            System.out.print("Enter a score: ");
            userInput = collector.nextInt();
            if(count % 2 == 0) {
                total += userInput;
            }
            userInput = 0;
        }
        System.out.print("Total Scores: " + total);
    }
}
