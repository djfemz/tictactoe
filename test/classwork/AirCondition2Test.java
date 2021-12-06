package classwork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirCondition2Test {

    @Test
            public void acCanBeTurnedOnTest() {
        // i have an ac and it is turned off
        AirCondition2 lG = new AirCondition2("lG");
        assertFalse(lG.isOn());

        // when i turn it on
        lG.turnOn();

        // check that it is on
        assertTrue(lG.isOn());

    }

    @Test
    public void acCanBeTurnedOffTest(){
        AirCondition2 lG = new AirCondition2 ("lG");
        // when the ac is on
        lG.turnOn();
        assertTrue(lG.isOn());

        // when i turn it off
        lG.turnOff();

        // check that it is off
        assertFalse(lG.isOn());
    }

    @Test
    public void iCanIncreaseTheTemperatureOfAcTest(){
        AirCondition2 lG = new AirCondition2 ("lG");
        // i have an ac, the ac is on, the current temperature is 16
        lG.turnOn();
        assertTrue(lG.isOn());
        int temp = lG.getTemperature();
        assertEquals(16, temp);

        // when i increase temperature

        lG.increaseTemperature();
        int temperature = lG.getTemperature();
        assertEquals(17, temperature);

    }


    @Test
    public void iCanDecreaseTheTemperatureOfAcTest(){
        // i have an ac, the ac is on and the current temperature is 16

        AirCondition2 lG = new AirCondition2 ("lG");
        lG.turnOn();
        assertTrue(lG.isOn());

        // increase the temperature of the ac
        for(int i = 0; i <4 ; i++) {
            lG.increaseTemperature();
        }
        int temp = lG.getTemperature();
        assertEquals(20, temp);

        // decreasing temperature
        lG.decreaseTemperature();
        assertEquals(19, lG.getTemperature());
    }

        @Test
    public void temperatureCantGoBeyond30Test(){
        AirCondition2 lG = new AirCondition2("lG");
        lG.turnOn();
        assertTrue(lG.isOn());

        // increase temperature
            for(int i = 0; i < 14; i++){
                lG.increaseTemperature();
            }
            assertEquals(30,lG.getTemperature());

            // increasing the temperature
            lG.increaseTemperature();
            assertEquals(30,lG.getTemperature());
        }

    @Test
    public void temperatureCantGoBelow16Test() {
        AirCondition2 lG = new AirCondition2("lG");
        lG.turnOn();
        assertTrue(lG.isOn());

        assertEquals(16, lG.getTemperature());
        lG.decreaseTemperature();
        assertEquals(16,lG.getTemperature());
    }

    @Test
    public void acTempIsZeroWhenOffTest(){
        AirCondition2 lG = new AirCondition2("lG");
        lG.turnOff();
        assertFalse(lG.isOn());

        // when i increase the temperature it should be zero
        assertEquals(0,lG.getTemperature());
    }

    @Test
    public void acCantBeIncreasedWhenOffTest(){
        AirCondition2 lG = new AirCondition2("lG");
        lG.turnOff();
        assertFalse(lG.isOn());

        // when i increase the temperature
        lG.increaseTemperature();
        assertEquals(0, lG.getTemperature());

        // when i turn it on it is 16
        lG.turnOn();
        assertTrue(lG.isOn());
        assertEquals(16, lG.getTemperature());
    }

    @Test
    public void acRetainsTemperatureAfterARestartTest(){
        AirCondition2 lG = new AirCondition2("lG");
        lG.turnOn();
        assertTrue(lG.isOn());

        lG.increaseTemperature();
        lG.increaseTemperature();
        lG.increaseTemperature();
        assertEquals(19, lG.getTemperature());

        lG.turnOff();
        lG.turnOn();
        assertEquals(19, lG.getTemperature());

    }
}
