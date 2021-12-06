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

    public void changeChannelForward() {
        if(isOn){if (channel < 10) channel++; }

    }

    public void changeChannelBackward() {
        if(isOn){ if (channel > 1) channel--;}
    }
//
//    public int increaseChannel(int channelNumber) {
//        if (isOn)if (channelNumber <= 10) {return channelNumber;}
//        return channel;
//    }

    public int increaseChannel(int channelNumber) {
        if
            (isOn){ if (channelNumber <= 10){
                // return channel++;
            channel = channelNumber;
            return channel;
        }

        }
        return 0;
    }
}
