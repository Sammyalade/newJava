import airConditioner.AirConditioner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {

    public AirConditioner myAirConditioner;
    @BeforeEach
    public void initializeVariable(){
        myAirConditioner = new AirConditioner();
    }

    @Test
    public void testThatAcIsOn(){

        assertFalse(myAirConditioner.isOn());

        myAirConditioner.powerOn();

        assertTrue(myAirConditioner.isOn());
    }

    @Test
    public void testThatAcIsOff(){
        myAirConditioner.powerOn();
        assertTrue(myAirConditioner.isOn());

        myAirConditioner.powerOff();

        assertFalse(myAirConditioner.isOn());
    }

    @Test
    public void testThatAcTemperatureCanIncreases() {
        myAirConditioner.powerOn();
        assertTrue(myAirConditioner.isOn());

        myAirConditioner.increaseTemperature(1);

        assertEquals(17, myAirConditioner.getTemperature());
    }

    @Test
    public void testThatAcTemperatureCanDecreases() {
        myAirConditioner.powerOn();
        assertTrue(myAirConditioner.isOn());

        myAirConditioner.decreaseTemperature();

        assertEquals(16, myAirConditioner.getTemperature());
    }

    @Test
    public void testThatAcTemperatureCanNotIncreasePass30() {
        myAirConditioner.powerOn();
        assertTrue(myAirConditioner.isOn());

        myAirConditioner.increaseTemperature(14);
        myAirConditioner.increaseTemperature(1);


        assertEquals(30, myAirConditioner.getTemperature());
    }

    @Test
    public void testThatAcTemperatureCanNotDecreasePass16() {
        myAirConditioner.powerOn();
        assertTrue(myAirConditioner.isOn());

        myAirConditioner.decreaseTemperature();

        assertEquals(16, myAirConditioner.getTemperature());
    }

    @Test
    public void testThatAcTemperatureCanNotIncreaseWhenOff() {
        assertFalse(myAirConditioner.isOn());

        myAirConditioner.increaseTemperature(1);

        assertEquals(16, myAirConditioner.getTemperature());
    }

    @Test
    public void testThatAcTemperatureCanNotDecreaseWhenOff() {
        myAirConditioner.powerOn();
        myAirConditioner.increaseTemperature(14);
        myAirConditioner.powerOff();
        assertFalse(myAirConditioner.isOn());


        myAirConditioner.decreaseTemperature();

        assertEquals(30, myAirConditioner.getTemperature());
    }


}