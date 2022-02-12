package chapterEight.cylinder;

public class Cylinder {
    private int radius = 1;
    private int height = 1;


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

    public double calculateVolumeOfACylinder(){
        double volume = Math.PI * Math.pow(getRadius(),2) * getHeight();
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
