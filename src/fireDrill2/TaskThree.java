package fireDrill2;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner collector = new Scanner(System.in);
        int userInput = 0;
        int total = 0;
        for(int count = 0; count < 10; count++){
            System.out.print("Enter a score: ");
            userInput = collector.nextInt();
            total += userInput;
            userInput = 0;
        }
        System.out.printf("Average Scores: %d%nTotal Scores: %d", (total/10), total);
    }
}
