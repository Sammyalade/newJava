package CarbonFootPrint;

public class Car implements CarbonFootPrint {
    private final double fuelConsumption;
    private final double emissionsFactor;

    public Car(double fuelConsumption, double emissionsFactor) {
        this.fuelConsumption = fuelConsumption;
        this.emissionsFactor = emissionsFactor;
    }

    @Override
    public double returnCarbonFootPrint() {
        double litersPerKilometer = fuelConsumption / 100;
        return litersPerKilometer * emissionsFactor;
    }
}

