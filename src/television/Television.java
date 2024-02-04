package television;

public class Television {

    private boolean isOn;

    private int channelNumber;

    private int highestChannelNumber;
    private int lowestChannelNumber = 1;
    private int volume;
    private String inputSource;

    public boolean isOn() {
        return isOn;
    }

    public void switchOn() {
        isOn = true;
    }

    public void switchOff() {
        isOn = false;
    }

    public void setHighestChannelNumber(int setHighestChannelNumber){
        highestChannelNumber = setHighestChannelNumber;
        channelNumber = highestChannelNumber;

    }

    public void setLowestChannelNumber(){
        channelNumber = lowestChannelNumber;
    }

    public void increaseChannelNumber() {
        if (isOn) {
            boolean isHighestChannelNumber = channelNumber == highestChannelNumber;
            if (!isHighestChannelNumber) {
                channelNumber++;
            }
        }
    }


    public int getChannelNumber() {
        return channelNumber;
    }

    public void decreaseChannelNumber() {
        boolean isLowestChannelNumber = channelNumber == lowestChannelNumber;

        if (isOn) {
            if (!isLowestChannelNumber){
                channelNumber--;
            }
        }
    }

    public void decreaseVolume() {
        if (isOn && volume > 0) {
            volume--;
        }
    }

    public void setVolume(int setHighestVolume){
        volume = setHighestVolume;
    }

    public int getVolumeNumber() {
        return volume;
    }

    public void increaseVolume() {
        if (isOn && volume < 100) {
            volume++;
        }    }

    public void changeInputSource(int inputSourceType) {
        if (isOn) {
            if (inputSourceType == 1){
                inputSource = "HDMI";
            } else if (inputSourceType == 2) {
                inputSource = "Component Video";
            } else if (inputSourceType == 3) {
                inputSource = "VGA";
            } else if (inputSourceType == 4) {
                inputSource = "USB";
            }
        }
    }

    public String getInputSource() {
        return inputSource;
    }
}
