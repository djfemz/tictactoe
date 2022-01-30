package practice.fanApp;

public enum Fan {
    SLOW(1),
    MEDIUM (2),
    FAST (3),
    ;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    Fan(int check) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
}
