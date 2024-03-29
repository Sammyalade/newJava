package carbonFootPrint;

public class Bicycle implements CarbonFootPrint{
    private final String brand;

    private final String model;

    public Bicycle(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    @Override
    public double returnCarbonFootPrint() {
        double manufacturingEmissions = 50;
        double maintenanceEmissions = 10;

        return manufacturingEmissions + maintenanceEmissions;
    }
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

}
