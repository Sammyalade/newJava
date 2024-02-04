package motorBike;

public class MotorBike {

    private boolean isOn;
    private int speed;
    public void switchOn() {
        isOn = true;
    }

    public boolean isOn() {
        return isOn;
    }

    public void switchOff() {
        isOn = false;
    }

    public void setSpeed(int desiredSpeed){
        speed = desiredSpeed;
    }

    public void accelerator() {

        boolean isGearOne = speed >= 0 && speed < 21;
        boolean isGearTwo = speed >= 21 && speed < 31;
        boolean isGearThree = speed >= 31 && speed < 41;
        boolean isGearFour = speed >= 41;

        if(isOn && isGearOne) { speed++;}
        else if (isOn && isGearTwo) { speed += 2; }
        else if (isOn && isGearThree) { speed += 3; }
        else if (isOn && isGearFour) { speed += 4; }
    }

    public int getMotorBikeSpeed() {
        return speed;
    }

    public void decelerator() {
        boolean isGearOne = speed > 0 && speed < 21;
        boolean isGearTwo = speed >= 21 && speed < 31;
        boolean isGearThree = speed >= 31 && speed < 41;
        boolean isGearFour = speed >= 41;

        if (isOn && isGearOne) { speed--;}
        else if (isOn && isGearTwo) { speed -= 2;}
        else if (isOn && isGearThree) { speed -= 3;}
        else if (isOn && isGearFour) { speed -= 4;}
    }
}
