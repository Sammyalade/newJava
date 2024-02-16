package CarbonFootPrint;

public class Bicycle implements CarbonFootPrint{
    private String brand;

    private String model;

    public Bicycle(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    @Override
    public double calculateCarbonFootprint() {
        double manufacturingEmissions = 50;
        double maintenanceEmissions = 10;

        return manufacturingEmissions + maintenanceEmissions;
    }

    @Override
    public double getCarbonFootPrint() {
        return 0;
    }
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

}
