package classwork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeAppTest {
    @Test
    public void bikeCanBeTurnOn(){
        Bike yahama = new Bike("yahama");
        assertFalse(yahama.isOn());

        yahama.turnOn();
        assertTrue(yahama.isOn());
    }

    @Test
    public void bikeCanBeTurnOff(){
        Bike yahama = new Bike("yahama");
        yahama.turnOn();
        assertTrue(yahama.isOn());

        yahama.turnOff();
        assertFalse(yahama.isOn());
    }

    @Test
    public void bikeCanBeAcceleratedBy1(){
        Bike yahama = new Bike("yahama");
        yahama.turnOn();
        assertTrue(yahama.isOn());

        yahama.getSpeed();
        assertEquals(0, yahama.getSpeed());


          int myResult =  yahama.acceleration(1);

        assertEquals(1, myResult);
    }

    @Test
    public void bikeCanBeAcceleratedBy2(){
        Bike yahama = new Bike("yahama");
        yahama.turnOn();
        assertTrue(yahama.isOn());

        yahama.getSpeed();
        assertEquals(0, yahama.getSpeed());

 for (int i =0; i < 4; i++) {
    yahama.acceleration(2);
 }
    assertEquals(8, yahama.getSpeed());

    }

    @Test
    public void bikeCanBeAcceleratedBy3(){
        Bike yahama = new Bike("yahama");
        yahama.turnOn();
        assertTrue(yahama.isOn());

        yahama.getSpeed();
        assertEquals(0, yahama.getSpeed());

        for (int i =0; i < 4; i++) {
            yahama.acceleration(3);
        }
        assertEquals(12, yahama.getSpeed());

    }

    @Test
    public void bikeCanBeAcceleratedBy4(){
        Bike yahama = new Bike("yahama");
        yahama.turnOn();
        assertTrue(yahama.isOn());

        yahama.getSpeed();
        assertEquals(0, yahama.getSpeed());

        for (int i =0; i < 4; i++) {
            yahama.acceleration(4);
        }
        assertEquals(16, yahama.getSpeed());
    }

    @Test
    public void bikeCanBeDeceleratedBy1(){
        Bike yahama = new Bike("yahama");
        yahama.turnOn();
        assertTrue(yahama.isOn());

        yahama.getSpeed();
        assertEquals(0, yahama.getSpeed());

        yahama.deceleration(1);
       int speed= yahama.getSpeed();

        assertEquals(0, speed);
    }

    @Test
    public void bikeCanBeDeceleratedBy2(){
        Bike yahama = new Bike("yahama");
        yahama.turnOn();
        assertTrue(yahama.isOn());

      yahama.acceleration(4);

        yahama.getSpeed();
        assertEquals(4, yahama.getSpeed());
        yahama.deceleration(2);
        int speed= yahama.getSpeed();

        assertEquals(2, speed);
    }

    @Test
    public void bikeCanBeDeceleratedBy3(){
        Bike yahama = new Bike("yahama");
        yahama.turnOn();
        assertTrue(yahama.isOn());

        yahama.acceleration(4);

        yahama.getSpeed();
        assertEquals(4, yahama.getSpeed());
        yahama.deceleration(3);
        int speed= yahama.getSpeed();

        assertEquals(1, speed);
    }

    @Test
    public void bikeCanBeDeceleratedBy4(){
        Bike yahama = new Bike("yahama");
        yahama.turnOn();
        assertTrue(yahama.isOn());

        yahama.acceleration(4);

        yahama.getSpeed();
        assertEquals(4, yahama.getSpeed());
        yahama.deceleration(4);
        int speed= yahama.getSpeed();

        assertEquals(0, speed);
    }

    @Test
    public void bikeGearIs1(){
        Bike yahama = new Bike("yahama");
        yahama.turnOn();
        assertTrue(yahama.isOn());

        yahama.acceleration(4);

        yahama.getSpeed();
        assertEquals(4, yahama.getSpeed());
        yahama.setGear();

        assertEquals(1, yahama.getGear());
    }

    @Test
    public void bikeGearIs2(){
        Bike yahama = new Bike("yahama");
        yahama.turnOn();
        assertTrue(yahama.isOn());

        for (int i = 0; i < 6 ; i++)yahama.acceleration(4);

        assertEquals(24, yahama.getSpeed());
        yahama.setGear();

        assertEquals(2, yahama.getGear());
    }

}


