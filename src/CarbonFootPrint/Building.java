package CarbonFootPrint;

public class Building implements CarbonFootPrint{

    private int numberOfRooms;

    @Override
    public double returnCarbonFootPrint() {
        double constructionEmissions = 80;
        double maintenanceEmissions = 30;

        return constructionEmissions + maintenanceEmissions;
    }


}
