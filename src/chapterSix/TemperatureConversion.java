package chapterSix;

public class TemperatureConversion {
    private double kelvin;
    private double celsius;
    public void  setKelvin(int number){
        kelvin = number + 273.15;
    }
    public double getKelvin(){
        return kelvin;
    }
    public void setCelsius(int number){
        celsius= number - 273.15;
    }

    public double getCelsius() {
        return celsius;
    }
}
