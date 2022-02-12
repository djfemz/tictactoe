package chapterEight;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        this(0, 0, 0);
    }

    public Time(int hour) {
        this(hour, 0, 0);
    }

    public Time(int hour, int minute) {
        this(hour, minute, 0);
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
    }

    public Time(Time time) {

        this(time.getHour(), time.getMinute(), time.getSecond());

    }

    public void setHour(int hour) {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");

    }

    public void setMinute(int minute) {
        if (minute > 59) {
        this.minute = 0;
        incrementHour();
    }
    else if (minute >= 0)
        this.minute = second;
    else throw new IllegalArgumentException("Minutes is invalid");
    }

    private void incrementHour() {
        hour++;
    }

    public void setSecond(int second) {
        if (second > 59) {
            this.second = 0;
            incrementMinute();
        }
        else if (second >= 0)
            this.second = second;
        else throw new IllegalArgumentException("Seconds is invalid");
    }

    private void incrementMinute() {
        minute++;
    }

    public void tick(){
   second++;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public String toUniversalString() {
        return String.format(
                "%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));


    }
}
