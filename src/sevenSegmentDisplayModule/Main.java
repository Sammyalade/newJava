package sevenSegmentDisplayModule;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the switch pattern (8 characters of 0s and 1s): ");
            String switchPattern = scanner.nextLine();

            SevenSegmentDisplayTwo display = new SevenSegmentDisplayTwo(switchPattern);
            //System.out.println(display.switchOn());
        } catch (InputMismatchException e) {
            System.out.println("Invalid input: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
