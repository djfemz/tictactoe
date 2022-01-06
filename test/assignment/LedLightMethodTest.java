package assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LedLightMethodTest {

    @Test
    public void iCanTurnOnLedLightTest(){
        LedLightMethod led =new LedLightMethod();
        assertFalse(led.isOn());

        led.turnOn("11111111");
        assertTrue(led.isOn());
    }

    @Test
    public void iCanTurnOffLedLightTest(){
        LedLightMethod led =new LedLightMethod();
        led.turnOn("11111111");
        assertTrue(led.isOn());

        led.turnOff();
        assertFalse(led.isOn());
    }

    @Test
    public void testASideOfALedLightCanBeTurnedOn(){
        LedLightMethod led =new LedLightMethod();
        led.turnOn("11111111");
        assertTrue(led.isOn());

        int [][] number =  {{1,1,1,1}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}};
        led.turnOnSideA("11011011");
       int[][] newArray = led.getArray();
        assertArrayEquals(number, newArray);
    }

    @Test
    public void testBSideOfALedLightCanBeTurnedOn(){
        LedLightMethod led =new LedLightMethod();
        led.turnOn("11111111");
        assertTrue(led.isOn());

        int [][] number =  {{0,0,0,1}, {0,0,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,0,0}};
        led.turnOnSideB("11011011");
       int[][] newArray = led.getArray();
        assertArrayEquals(number, newArray);
    }
 @Test
    public void testCSideOfALedLightCanBeTurnedOn(){
        LedLightMethod led =new LedLightMethod();
        led.turnOn("11111111");
        assertTrue(led.isOn());

        int [][] number =  {{0,0,0,0}, {0,0,0,0}, {0,0,0,1}, {0,0,0,1}, {0,0,0,1}};
        led.turnOnSideC("11111011");
       int[][] newArray = led.getArray();
        assertArrayEquals(number, newArray);
    }
@Test
    public void testDSideOfALedLightCanBeTurnedOn(){
        LedLightMethod led =new LedLightMethod();
        led.turnOn("11111111");
        assertTrue(led.isOn());

        int [][] number =  {{0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {1,1,1,1}};
        led.turnOnSideD("11111111");
       int[][] newArray = led.getArray();
        assertArrayEquals(number, newArray);
    }
 @Test
    public void testESideOfALedLightCanBeTurnedOn(){
        LedLightMethod led =new LedLightMethod();
        led.turnOn("11111111");
        assertTrue(led.isOn());

        int [][] number =  {{0,0,0,0}, {0,0,0,0}, {1,0,0,0}, {1,0,0,0}, {1,0,0,0}};
        led.turnOnSideE("11111111");
       int[][] newArray = led.getArray();
        assertArrayEquals(number, newArray);
    }
     @Test
    public void testFSideOfALedLightCanBeTurnedOn(){
        LedLightMethod led =new LedLightMethod();
        led.turnOn("11111111");
        assertTrue(led.isOn());

        int [][] number =  {{1,0,0,0}, {1,0,0,0}, {1,0,0,0}, {0,0,0,0}, {0,0,0,0}};
         led.turnOnSideF("11111111");
       int[][] newArray = led.getArray();
        assertArrayEquals(number, newArray);
    }
     @Test
    public void testGSideOfALedLightCanBeTurnedOn(){
        LedLightMethod led =new LedLightMethod();
        led.turnOn("11111111");
        assertTrue(led.isOn());

        int [][] number =  {{0,0,0,0}, {0,0,0,0}, {1,1,1,1}, {0,0,0,0}, {0,0,0,0}};
         led.turnOnSideG("11111111");
       int[][] newArray = led.getArray();
        assertArrayEquals(number, newArray);
    }

    @Test
    public void testLastDigitCanSwitchLedLightOn(){
        LedLightMethod led =new LedLightMethod();
        led.turnOn("11111111");
        assertTrue(led.isOn());

        int [][] number =  {{0,0,0,0}, {0,0,0,0}, {1,1,1,1}, {0,0,0,0}, {0,0,0,0}};
        led.turnOnSideG("11111111");
        int[][] newArray = led.getArray();
        assertArrayEquals(number, newArray);
    }

}
