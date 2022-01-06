package assignment;

public class Television {
    private boolean isOn;
    private int volume = 1;
    private int channel = 1;
    public Television(String tvName) {
    }

    public boolean isOn() { return isOn;}

    public void turnOn() { isOn = true;}

    public void turnOff() { isOn = false;}

    public int getVolume() {
        if (isOn) {return volume;}
        return 1;
    }

    public void increaseVolume() {
      if (isOn) { if (volume < 100 ) volume++;}

    }

    public void decreaseVolume() {
      if(isOn) { if (volume > 1) volume--;}
    }

    public int getChannel() {
        if (isOn){return channel;}
        return 0;
    }

    public void increaseChannel() {
        if(isOn){if (channel < 10) channel++; }

    }

    public void decreaseChannel() {

        if(isOn){
            if (channel > 1) channel--;}
    }


    public void setChannel(int channelNumber) {
        if(isOn) {
            if (channelNumber <= 10) {
                channel = channelNumber;

            }
        }
    }
    public String toString(){
        String Television = " ";
        Television += "Tv is "+ (isOn()? "on": "off") +"\n";
        Television += "Volume is "+ getVolume() + "\n";
        Television += "Channel " + getChannel() + "\n";
        return Television;
    }



}
