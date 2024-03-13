package sixGeoPoliticalZone;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        SixGeoPoliticalZoneChecker checker = new SixGeoPoliticalZoneChecker();

        Scanner collector = new Scanner(System.in);

        try (collector) {
            System.out.print("Enter the name of the state: ");
            String stateName = collector.nextLine();
            SixGeoPoliticalZone zone = checker.returnPoliticalZone(stateName);
            System.out.println("State belongs to the " + zone + " geo-political zone.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
