package chapterEight;

public class Time2 {
    private  int hour;
    private  int seconds;
    private boolean haveAtime = false;
    private int minute;
    public Time2(int minute, int seconds){
        validateMinute(minute);
        validateMinute(seconds);
        this.seconds = seconds;
        this.minute = minute;
    }
    public Time2 (){
}
public Time2(int seconds){
    validate(seconds);
//    this.seconds = seconds;
}

    public Time2(int hour, int minute, int seconds) {
        this.seconds =seconds;
        this.minute = minute;
        this.hour = hour;
    }
    public void validate(int hour, int minutes, int seconds){
        validate(seconds);
        validateMinute(minutes);
        validateHour(hour);
    }

    public boolean haveAtime() {
        return true;
    }
public void setSeconds(int seconds){
    validate(seconds);

}

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSeconds() {

    return seconds;
    }

    public int getHour() {
        validateHour(hour);
        return hour;
    }

    public void validate(int seconds){
        if (seconds < 0 || seconds > 59){
           this.seconds = 0;
        }else this.seconds = seconds;
    }

    public int getMinute() {
        validateMinute(minute);
        return minute;
    }
    public void validateMinute(int minute){
        if (minute < 0 || minute > 59){
            this.minute = 0;
        }
    }

    public void validateHour(int hour){
        if (hour < 0 || hour > 24){
            this.hour = 0;
        }
    }
}