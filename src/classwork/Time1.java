package classwork;

public class Time1 {
    private int hour;
    private int minute;
    private int seconds;
    public Time1(int hour){
    this(hour,0);
    }
    public Time1(int hour, int minute){

        this(hour,minute,0);
    }
    public Time1(){
    }
    public Time1(int hour, int minute, int seconds){
        this.hour = hour;
        this.minute = minute;
        this.seconds=seconds;
    }
    public void setTime(int hour, int minute, int seconds ){
        validate(hour, minute, seconds);
        this.hour = hour;
        this.minute = minute;
        this.seconds=seconds;
    }

    private void validate(int hour, int minute, int seconds) {
        validate(hour);
        check(minute);
        checkFor(seconds);
    }

    private void checkFor(int seconds) {
        if (seconds < 0|| seconds > 59){
            throw new IllegalArgumentException("Seconds is out of range");
        }
    }

    private void check(int minute) {
        if (minute < 0|| minute > 59){
            throw new IllegalArgumentException("Minute is out of range");
        }
    }

    private void validate(int hour) {
        if (hour < 0|| hour > 24){
            throw new IllegalArgumentException("Hour is out of range");
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, seconds);
    }
}
