import motorBike.MotorBike;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MotorBikeTest {

    private MotorBike myMotorBike;

    @BeforeEach
    public void initializeIt(){
        myMotorBike = new MotorBike();
    }

    @Test
    public void switchMotorBikeOn_motorBikeIsOnTest(){
        assertFalse(myMotorBike.isOn());

        myMotorBike.switchOn();

        assertTrue(myMotorBike.isOn());
    }
    @Test
    public void switchMotorBikeOff_motorBikeIsOffTest(){
        myMotorBike.switchOn();
        assertTrue(myMotorBike.isOn());

        myMotorBike.switchOff();

        assertFalse(myMotorBike.isOn());
    }

    @Test
    public void accelerateBike_bikeIncreasesTest(){
        myMotorBike.switchOn();
        assertTrue(myMotorBike.isOn());

        myMotorBike.setSpeed(0);
        myMotorBike.accelerator();
        assertEquals(1, myMotorBike.getMotorBikeSpeed());

    }

    @Test
    public void decelerateBike_bikeSpeedReducesTest(){
        myMotorBike.switchOn();
        assertTrue(myMotorBike.isOn());

        myMotorBike.setSpeed(0);
        myMotorBike.accelerator();
        myMotorBike.decelerator();

        assertEquals(0, myMotorBike.getMotorBikeSpeed());
    }

    @Test
    public void accelerateMotorBikeWhenIsOff_speedRemainUnchangedTest(){
        assertFalse(myMotorBike.isOn());

        myMotorBike.setSpeed(0);
        myMotorBike.accelerator();

        assertEquals(0, myMotorBike.getMotorBikeSpeed());
    }

    @Test
    public void decelerateMotorBikeWhenIsOff_speedRemainUnchangedTest(){
        myMotorBike.switchOn();

        myMotorBike.setSpeed(0);
        myMotorBike.accelerator();
        myMotorBike.switchOff();
        assertFalse(myMotorBike.isOn());
        myMotorBike.decelerator();

        assertEquals(1, myMotorBike.getMotorBikeSpeed());
    }

    @Test
    public void decelerateSpeedWhileItIsZero_SpeedRemainUnchangedTest(){
        myMotorBike.switchOn();
        assertTrue(myMotorBike.isOn());

        myMotorBike.decelerator();

        assertEquals(0, myMotorBike.getMotorBikeSpeed());
    }

    @Test
    public void motorBikeIsOnGearOne_speedIncreasesByOneTest(){
        myMotorBike.switchOn();
        assertTrue(myMotorBike.isOn());

        myMotorBike.setSpeed(0);
        myMotorBike.accelerator();

        assertEquals(1, myMotorBike.getMotorBikeSpeed());
    }

    @Test
    public void motorBikeIsOnGearTwo_speedIncreasesByTwoTest(){
        myMotorBike.switchOn();
        assertTrue(myMotorBike.isOn());

        myMotorBike.setSpeed(21);
        myMotorBike.accelerator();

        assertEquals(23, myMotorBike.getMotorBikeSpeed());
    }

    @Test
    public void motorBikeIsOnGearThree_SpeedIncreasesByThreeTest(){
        myMotorBike.switchOn();
        assertTrue(myMotorBike.isOn());

        myMotorBike.setSpeed(31);
        myMotorBike.accelerator();

        assertEquals(34, myMotorBike.getMotorBikeSpeed());
    }

    @Test
    public void motorBikeIsOnGearFour_SpeedIncreasesByFourTest(){
        myMotorBike.switchOn();
        assertTrue(myMotorBike.isOn());

        myMotorBike.setSpeed(41);
        myMotorBike.accelerator();

        assertEquals(45, myMotorBike.getMotorBikeSpeed());
    }

    @Test
    public void decelerateWhenMotorBikeIsOnGearFour_speedDecreasesByFourTest(){
        myMotorBike.switchOn();
        assertTrue(myMotorBike.isOn());

        myMotorBike.setSpeed(41);

        myMotorBike.decelerator();

        assertEquals(37, myMotorBike.getMotorBikeSpeed());
    }

    @Test
    public void decelerateWhenMotorBikeIsOnGearThree_speedDecreasesByThreeTest(){
        myMotorBike.switchOn();
        assertTrue(myMotorBike.isOn());

        myMotorBike.setSpeed(31);

        myMotorBike.decelerator();

        assertEquals(28, myMotorBike.getMotorBikeSpeed());
    }

    @Test
    public void decelerateWhenMotorBikeIsOnGearTwo_speedDecreasesByTwoTest(){
        myMotorBike.switchOn();
        assertTrue(myMotorBike.isOn());

        myMotorBike.setSpeed(21);

        myMotorBike.decelerator();

        assertEquals(19, myMotorBike.getMotorBikeSpeed());
    }


}
