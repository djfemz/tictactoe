package classwork;

public class AirCondition {
    private boolean isOn;
    private int temperature;
    private String productName = "LG";

    public AirCondition(boolean isOn, int myTemperature) {
        isOn = isOn;
        myTemperature = temperature;
    }

    public boolean onAc(boolean isOn) {
        if (isOn) return true;
        return false;
    }

    public int increaseTemperature(int temperature, boolean isOn) {


        if ((temperature >= 16) && (temperature<= 30) && (isOn)) return temperature;
           return 0;

    }
    public int beyondTemperature(int temperature, boolean isOn){
        if (temperature < 16) return 16;
        if (temperature > 30) return 30;
        return 0;
    }


}
