package floChecker;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            FloCheckerTwo floChecker = new FloCheckerTwo();
            System.out.println("""
                    Welcome to FloChecker!
                    ==========================================================
                    FloChecker helps you track your menstrual cycle,
                    predict your next period, and identify your fertile window.
                    ==========================================================
                    Let's get started!
                    """);
            System.out.println("Enter your last menstrual date (YYYY-MM-DD):");
            String lastMenstrualDate = scanner.nextLine();

            System.out.println("Enter the length of your menstrual cycle in days:");
            int cycleLength = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter the length of your menstrual period in days:");
            int periodLength = Integer.parseInt(scanner.nextLine());

            String result = floChecker.checkMenstrualCircle(lastMenstrualDate, cycleLength, periodLength);
            System.out.println(result);
        } catch (InputMismatchException ex) {
            System.out.println("Closing the app now, please run again and enter correct details.......");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
