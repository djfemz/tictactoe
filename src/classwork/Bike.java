package classwork;

public class Bike {
    private boolean isOn;
    private int gear;
    private int speed;

    public Bike(String bikeName) {
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public int getSpeed() {
        if (isOn)
            if (speed < 0) return 0;
       return speed;
    }
    public int getGear(){

        if (isOn) return gear;
        return 0;
    }

    public void setGear() {
       if (isOn) {
           if ((speed > -1) && (speed <= 20))
               gear = 1;
           if ((speed > 20) && (speed <= 30))
               gear = 2;
           if ((speed > 30) && (speed <= 40))
               gear = 3;
           if (speed > 40) gear =4;
       }

    }
    public int acceleration(int gear){
        if (gear == 1 ) speed++;
        if (gear == 2) speed +=2;
        if (gear == 3) speed +=3;
        if (gear == 4) speed +=4;
        return speed;
    }

    public int deceleration(int gear){
        if (gear < 1) {speed = 0;}
        if (gear == 1 ) speed--;
        if (gear == 2) speed -=2;
        if (gear == 4) speed -=4;
        if (gear == 3) speed -=3;
        return speed;
    }


    @Override
    public String toString(){
        String Bike = " ";
        Bike += "Bike is "+ (isOn()? "on": "off") +"\n";
        Bike += "acceleration is "+ getSpeed() + "\n";
        Bike += "deceleration is " + getSpeed() + "\n";
        return Bike;
    }
}