import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import television.Television;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {

    private Television myTelevision;

    @BeforeEach
    public void initializeTelevision(){
        myTelevision = new Television();
    }
    @Test
    public void switchTelevisionOn_televisionIsOnTest(){
        assertFalse(myTelevision.isOn());

        myTelevision.switchOn();

        assertTrue(myTelevision.isOn());
    }

    @Test
    public void switchTelevisionOff_televisionIsOffTest(){
        myTelevision.switchOn();
        assertTrue(myTelevision.isOn());

        myTelevision.switchOff();

        assertFalse(myTelevision.isOn());
    }

    @Test
    public void increaseTelevisionChannelNumberWhenItIsOn_televisionChannelNumberIncreasesTest(){
        myTelevision.switchOn();
        assertTrue(myTelevision.isOn());

        myTelevision.setLowestChannelNumber();
        myTelevision.increaseChannelNumber();

        assertEquals(2, myTelevision.getChannelNumber());
    }

    @Test
    public void increaseTelevisionChannelNumberWhenItIsOff_televisionChannelNumberRemainUnchanged(){
        assertFalse(myTelevision.isOn());

        myTelevision.increaseChannelNumber();

        assertEquals(0, myTelevision.getChannelNumber());
    }
    @Test
    public void decreaseTelevisionChannelNumberWhenItIsOn_televisionChannelNumberDecreasesTest(){
        myTelevision.switchOn();
        assertTrue(myTelevision.isOn());

        myTelevision.setHighestChannelNumber(10);
        myTelevision.decreaseChannelNumber();

        assertEquals(9, myTelevision.getChannelNumber());
    }

    @Test
    public void decreaseTelevisionChannelNumberWhenItIsOff_televisionChannelNumberRemainUnchangedTest(){
        assertFalse(myTelevision.isOn());

        myTelevision.decreaseChannelNumber();

        assertEquals(0, myTelevision.getChannelNumber());
    }

    @Test
    public void increaseTelevisionChannelNumberWhenItIsOnHighestNumberOfChannel_televisionChannelNumberRemainsUnchanged(){
        myTelevision.switchOn();
        assertTrue(myTelevision.isOn());

        myTelevision.setHighestChannelNumber(10);
        myTelevision.increaseChannelNumber();

        assertEquals(10, myTelevision.getChannelNumber());
    }

    @Test
    public void decreaseTelevisionChannelNumberWhenItIsOnLowestNumberOfChannel_televisionChannelNumberRemainsUnchanged(){
        myTelevision.switchOn();
        assertTrue(myTelevision.isOn());

        myTelevision.setLowestChannelNumber();
        myTelevision.decreaseChannelNumber();

        assertEquals(1, myTelevision.getChannelNumber());
    }
    @Test
    public void decreaseVolumeWhenTelevisionIsOn_televisionVolumesDecreases(){
        myTelevision.switchOn();
        assertTrue(myTelevision.isOn());

        myTelevision.setVolume(1);
        myTelevision.decreaseVolume();

        assertEquals(0, myTelevision.getVolumeNumber());
    }

    @Test
    public void decreaseVolumeWhenTelevisionIsOff_televisionVolumeRemainUnchanged(){
        assertFalse(myTelevision.isOn());

        myTelevision.decreaseVolume();

        assertEquals(0, myTelevision.getVolumeNumber());
    }

    @Test
    public void increaseVolumeWhenTelevisionIsOn_televisionVolumesIncreases(){
        myTelevision.switchOn();
        assertTrue(myTelevision.isOn());

        myTelevision.increaseVolume();

        assertEquals(1, myTelevision.getVolumeNumber());
    }

    @Test
    public void increaseVolumeWhenTelevisionIsOff_televisionVolumeRemainUnchanged(){
        assertFalse(myTelevision.isOn());

        myTelevision.increaseVolume();

        assertEquals(0, myTelevision.getVolumeNumber());
    }

    @Test
    public void decreaseTelevisionVolumeWhenItIsOnAndVolumeIsOnZero_televisionVolumeRemainUnchanged(){
        myTelevision.switchOn();
        assertTrue(myTelevision.isOn());

        myTelevision.decreaseVolume();

        assertEquals(0, myTelevision.getVolumeNumber());
    }

    @Test
    public void increaseTelevisionVolumeWhenItIsOnAndVolumeIsOnHighestVolume_televisionVolumeRemainUnchanged(){
        myTelevision.switchOn();
        assertTrue(myTelevision.isOn());

        myTelevision.setVolume(100);
        myTelevision.increaseVolume();

        assertEquals(100, myTelevision.getVolumeNumber());
    }

    @Test
    public void switchInputSourceWhenTelevisionIsOn_inputSourceChangesToTheNextSource(){
        myTelevision.switchOn();
        assertTrue(myTelevision.isOn());

        myTelevision.changeInputSource(1);

        assertEquals("HDMI", myTelevision.getInputSource());
    }

    @Test
    public void switchInputSourceWhenTelevisionIsOff_inputSourceRemainUnchanged(){
        assertFalse(myTelevision.isOn());

        myTelevision.changeInputSource(1);

        assertEquals(null, myTelevision.getInputSource());
    }

}
