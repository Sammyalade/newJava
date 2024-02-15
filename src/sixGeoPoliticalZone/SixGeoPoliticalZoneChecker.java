package sixGeoPoliticalZone;

public class SixGeoPoliticalZoneChecker {

    public SixGeoPoliticalZone returnPoliticalZone(String stateOfOrigin) {
        for(SixGeoPoliticalZone geoZones: SixGeoPoliticalZone.values()){
            if(checkForPoliticalZone(geoZones.getStatesInGeoZone(), stateOfOrigin)){
                return geoZones;
            }
        }
        return null;
    }

    private boolean checkForPoliticalZone(String[] states, String stateToCheck){
        for (String state : states) {
            if (stateToCheck.equalsIgnoreCase(state)) {
                return true;
            }
        }
        return false;
    }

}
