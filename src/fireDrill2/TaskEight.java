package fireDrill2;

import java.util.Scanner;

public class TaskEight {
    public static void main(String[] args) {
        Scanner collector = new Scanner(System.in);
        int userInput = 0;
        int total = 0;
        for (int count = 1; count <= 10; count++) {
            System.out.print("Enter a score: ");
            userInput = collector.nextInt();
            while(userInput < 0 || userInput > 100) {
                System.out.print("Please enter a valid score: ");
                userInput = collector.nextInt();
            }
            total += userInput;
        }
        System.out.printf("Total Of Valid Scores: %d", total);

    }
}
