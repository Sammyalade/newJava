package sixGeoPoliticalZone;

public enum SixGeoPoliticalZone {

    NORTH_CENTRAL("Benue", "FCT", "Kogi", "Kwara", "Nasarawa", "Niger", "Plateau"),
    NORTH_EAST("Adamawa", "Yobe", "Borno", "Bauchi", "Gombe", "Taraba", "jigawa"),
    NORTH_WEST("Kebbi", "Sokoto", "Katsina", "Zamfara", "Kaduna", "Kano"),
    SOUTH_WEST("Lagos", "Ondo", "Osun", "Oyo", "Ogun", "Ekiti"),
    SOUTH_EAST("Abia", "Anambra", "Ebonyi", "Enugu", "Imo"),
    SOUTH_SOUTH("Bayelsa", "Edo", "Cross River", "Delta", "Rivers", "Akwa Ibom");

    private final String[] statesInGeoZone;

    SixGeoPoliticalZone(String... statesInGeoZone) {
        this.statesInGeoZone = statesInGeoZone;
    }

    public String[] getStatesInGeoZone(){
        return statesInGeoZone;
    }


}
