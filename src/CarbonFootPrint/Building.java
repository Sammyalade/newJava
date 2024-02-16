package CarbonFootPrint;

public class Building implements CarbonFootPrint {
    private final int numberOfRooms;
    private final double constructionEmissionsPerRoom;
    private final double maintenanceEmissionsPerRoom;

    public Building(int numberOfRooms, double constructionEmissionsPerRoom, double maintenanceEmissionsPerRoom) {
        this.numberOfRooms = numberOfRooms;
        this.constructionEmissionsPerRoom = constructionEmissionsPerRoom;
        this.maintenanceEmissionsPerRoom = maintenanceEmissionsPerRoom;
    }

    @Override
    public double returnCarbonFootPrint() {
        double totalConstructionEmissions = constructionEmissionsPerRoom * numberOfRooms;
        double totalMaintenanceEmissions = maintenanceEmissionsPerRoom * numberOfRooms;

        return totalConstructionEmissions + totalMaintenanceEmissions;
    }
}
