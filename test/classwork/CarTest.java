package classwork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    @Test
    public void iCanPutOnMyCar(){
        Car toyota = new Car("toyota");
      assertFalse(toyota.isOn());

      toyota.turnOn();
      assertTrue(toyota.isOn());
    }

    @Test
    public void iCanPutOffMyCar(){
        Car toyota = new Car("toyota");
        toyota.turnOn();
        assertTrue(toyota.isOn());

        toyota.turnOff();
        assertFalse(toyota.isOn());

    }

    @Test
    public void iCanIncreaseSpeedBy1(){
        Car toyota = new Car("toyota");
        toyota.turnOn();
        assertTrue(toyota.isOn());

        for(int i = 0; i < 18; i++) {
            toyota.accelerate();
        }
        assertEquals(18, toyota.getSpeed());
    }


    @Test
    public void iCanDecreaseSpeedBy1(){
        Car toyota = new Car("toyota");
        toyota.turnOn();
        assertTrue(toyota.isOn());
        for(int i = 0; i < 18; i++) {
            toyota.accelerate();
        }
        assertEquals(18, toyota.getSpeed());

        toyota.decelerate();
        assertEquals(17, toyota.getSpeed());
    }

    @Test
    public void iCanIncreaseSpeedBy2(){
        Car toyota = new Car("toyota");
        toyota.turnOn();
        assertTrue(toyota.isOn());

        for(int i = 0; i < 22; i++) {
            toyota.accelerate();
        }
        assertEquals(23, toyota.getSpeed());
    }


    @Test
    public void iCanDecreaseSpeedBy2(){
        Car toyota = new Car("toyota");
        toyota.turnOn();
        assertTrue(toyota.isOn());

        for(int i = 0; i < 24; i++) {
            toyota.accelerate();
        }
        assertEquals(27, toyota.getSpeed());

        toyota.decelerate();
        assertEquals(25, toyota.getSpeed());
    }


    @Test
    public void iCanIncreaseSpeedBy3(){
        Car toyota = new Car("toyota");
        toyota.turnOn();
        assertTrue(toyota.isOn());

        for(int i = 0; i < 27; i++) {
            toyota.accelerate();
        }
        assertEquals(34, toyota.getSpeed());
    }


    @Test
    public void iCanDecreaseSpeedBy3(){
        Car toyota = new Car("toyota");
        toyota.turnOn();
        assertTrue(toyota.isOn());

        for(int i = 0; i < 28; i++) {
            toyota.accelerate();
        }
        assertEquals(37, toyota.getSpeed());
        toyota.decelerate();
        assertEquals(34, toyota.getSpeed());
    }


    @Test
    public void iCanIncreaseSpeedBy4(){
        Car toyota = new Car("toyota");
        toyota.turnOn();
        assertTrue(toyota.isOn());

        for(int i = 0; i < 30; i++) {
            toyota.accelerate();
        }
        assertEquals(43, toyota.getSpeed());
        toyota.accelerate();
        assertEquals(47, toyota.getSpeed());
    }


    @Test
    public void iCanDecreaseSpeedBy4(){
        Car toyota = new Car("toyota");
        toyota.turnOn();
        assertTrue(toyota.isOn());

        for(int i = 0; i < 30; i++) {
            toyota.accelerate();
        }
        assertEquals(43, toyota.getSpeed());
        toyota.accelerate();
        assertEquals(47, toyota.getSpeed());


        toyota.decelerate();
        assertEquals(43, toyota.getSpeed());
    }

    @Test
    public void iCanReturnGear1(){
        Car toyota = new Car("toyota");
        toyota.turnOn();
        assertTrue(toyota.isOn());

      toyota.accelerate();
      assertEquals(1, toyota.getGear());

    }

    @Test
    public void iCanReturnGear2(){
        Car toyota = new Car("toyota");
        toyota.turnOn();
        assertTrue(toyota.isOn());

        for(int i = 0; i < 24; i++) {
            toyota.accelerate();
        }
        assertEquals(2, toyota.getGear());
    }


    @Test
    public void iCanReturnGear3(){
        Car toyota = new Car("toyota");
        toyota.turnOn();
        assertTrue(toyota.isOn());


        for(int i = 0; i < 27; i++) {
            toyota.accelerate();
        }
        toyota.accelerate();
        assertEquals(3, toyota.getGear());
    }

    @Test
    public void iCanReturnGear4(){
        Car toyota = new Car("toyota");
        toyota.turnOn();
        assertTrue(toyota.isOn());

        for(int i = 0; i < 30; i++) {
            toyota.accelerate();
        }

        for(int i = 0; i < 2 ; i++)
        { toyota.accelerate();}
        assertEquals(4, toyota.getGear());
    }
}
