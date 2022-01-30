package chapterEight;

public class CylinderClass {
    private int radius;
    private int height;

    public CylinderClass(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        validateRadius(radius);
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        validateHeight(height);
        this.height = height;
    }

    public int calculateVolumeOfACylinder(){
        int volume = getRadius() * getHeight();
        return volume;
    }

    private void validateHeight(int height){
        if (height < 1 ){
            throw new IllegalArgumentException("Height is below 1");
        }
    }

    private void validateRadius(int radius){
        if (radius < 1 ){
            throw new IllegalArgumentException("Height is below 1");
        }
    }
}
