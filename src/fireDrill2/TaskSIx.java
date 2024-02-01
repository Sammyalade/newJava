package fireDrill2;

import java.util.Scanner;

public class TaskSIx {
    public static void main(String[] args) {
        Scanner collector = new Scanner(System.in);
        int userInput = 0;
        int total = 0;
        int oddCount = 0;
        for (int count = 1; count <= 10; count++) {

            System.out.print("Enter a score: ");
            userInput = collector.nextInt();
            if (userInput % 2 != 0) {
                total += userInput;
                oddCount++;
            }
            userInput = 0;
        }
        System.out.print("Average Of Odd Scores: " + total/oddCount);
    }
}
