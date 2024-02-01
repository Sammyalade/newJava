package fireDrill2;

import java.util.Scanner;

public class TaskNine {
    public static void main(String[] args) {
        Scanner collector = new Scanner(System.in);
        int userInput = 0;
        int total = 0;
        for (int count = 1; count <= 10; count++) {
            System.out.print("Enter a score: ");
            userInput = collector.nextInt();
            if (userInput >= 0 && userInput <= 100) {
                total += userInput;
            }

        }
        System.out.printf("Total Of Valid Scores: %d", total);
    }
}
