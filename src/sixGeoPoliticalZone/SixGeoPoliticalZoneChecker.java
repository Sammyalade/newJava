package sixGeoPoliticalZone;

public class SixGeoPoliticalZoneChecker {

    public SixGeoPoliticalZone returnPoliticalZone(String stateOfOrigin) throws Exception {
        for(SixGeoPoliticalZone geoZones: SixGeoPoliticalZone.values()){
            if(checkForPoliticalZone(geoZones.getStatesInGeoZone(), stateOfOrigin)){
                return geoZones;
            }
        }
        throw new Exception("State not found");
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
