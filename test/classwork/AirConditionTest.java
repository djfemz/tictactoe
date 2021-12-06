package classwork;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirConditionTest {
    private AirCondition myAirCondition;

    @BeforeEach
    public void beginClass(){
        myAirCondition = new AirCondition(true, 16);
    }

    @Test
    public void iHaveAnAc(){
        boolean aC = myAirCondition.onAc(true);
        assertEquals(true, aC);
    }

    @Test
    public void iHaveAnAcAndMyAcIsOff(){
        boolean aC = myAirCondition.onAc(false);
        assertEquals(false, aC);
    }

    @Test
    public void iWantToIncreaseTheTemperatureOfMyAc(){
        int highTemp = myAirCondition.increaseTemperature(16,true);
        assertEquals(16,highTemp);
    }

    @Test
    public void iWantToGoBeyondTheTemperatureOfMyAc(){
        int highTemp = myAirCondition.beyondTemperature(31,true);
        assertEquals(30,highTemp);
    }


}
