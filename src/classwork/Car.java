package classwork;

public class Car {

    private boolean isOn;
    private int speed;
    private int gear;
    public Car(String carName) {

    }

    public boolean isOn() { return isOn;}

    public void turnOn() { isOn = true;}

    public void turnOff() { isOn = false;}
    public int getSpeed(){

        if(isOn) {return speed;}
        return 0;
    }

    public void accelerate() {
        if(isOn) {
            if (speed > -1 && speed < 21) {
                speed++;
            }
           else if (speed > 20 && speed < 31) {
                speed += 2;
            }

           else if (speed > 30 && speed <= 40) {
                speed += 3;
            }
            else
                speed += 4;

        }

    }


    public int getGear(){
        if (isOn) {
            if (speed > -1 && speed < 21) {gear=1;}
            if (speed > 20 && speed < 31){ gear = 2;}
            if (speed > 30 && speed < 41) {gear = 3;}
            if (speed > 40 && speed < 100)  {gear = 4;}
            return gear;
        }
        return 0;
    }



    public void decelerate() {
        if (isOn) {
            if (speed > -1 && speed < 21) {
                speed--;
            }
          else  if (speed > 20 && speed < 31) {
                speed -= 2;
            }
          else  if (speed > 30 && speed < 41) {
                speed -= 3;
            }
            else if (speed > 40 && speed <= 100) {
                speed -= 4;

            }
            this.speed = speed;


        }
    }




    @Override
    public String toString(){
        String Car = " ";
        Car += "Car is "+ (isOn()? "on": "off") +"\n";
        Car += "acceleration is "+ getSpeed() + "\n";
        Car += "deceleration is " + getSpeed() + "\n";
        Car += "Gear is " + getGear() + "\n";
        return Car;
    }
}
