package airConditioner;

public class AirConditioner {
    private boolean isOn;
    private int temperature = 16;

    public void powerOff (){
        isOn = false;
    }

    public void powerOn() {
        isOn = true;
    }

    public boolean isOn(){
        return isOn;
    }

    public void increaseTemperature(int interval) {
        boolean isTemperatureRange = temperature >= 16 && temperature < 30;
        if (isOn && isTemperatureRange) {
            temperature+=interval;
        }
    }


    public int getTemperature() {
        return temperature;
    }

    public void decreaseTemperature() {
        boolean isTemperatureRange = temperature > 16 && temperature < 30;
        if (isOn && isTemperatureRange) {
            temperature--;
        }

    }
}
