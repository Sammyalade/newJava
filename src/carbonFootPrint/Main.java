package carbonFootPrint;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Building building = new Building(10, 50, 20);
        Car car = new Car(8.5, 250);
        Bicycle bicycle = new Bicycle("34545", "q2881u");

        ArrayList<CarbonFootPrint> carbonFootprints = new ArrayList<>();
        carbonFootprints.add(building);
        carbonFootprints.add(car);
        carbonFootprints.add(bicycle);

        for (CarbonFootPrint carbonFootprint : carbonFootprints) {
            if (carbonFootprint instanceof Building) {
                System.out.println("Building:");
                System.out.println("Carbon Footprint: " + carbonFootprint.returnCarbonFootPrint() + " kg of CO2");
            } else if (carbonFootprint instanceof Car) {
                System.out.println("Car:");
                System.out.println("Carbon Footprint: " + carbonFootprint.returnCarbonFootPrint() + " g of CO2 per km");
            } else if (carbonFootprint instanceof Bicycle) {
                System.out.println("Bicycle:");
                System.out.println("Carbon Footprint: " + carbonFootprint.returnCarbonFootPrint() + " kg of CO2 (assumed negligible)");
            }
            System.out.println("-----------------------------");
        }
    }
}
