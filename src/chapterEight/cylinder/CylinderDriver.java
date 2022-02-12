package chapterEight.cylinder;


public class CylinderDriver {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();

        cylinder.setHeight(45);
        cylinder.setRadius(7);
        System.out.printf("The volume of the cylinder for %d and %d is %.2f",
                cylinder.getHeight(),
                cylinder.getRadius(),cylinder.calculateVolumeOfACylinder());
    }
}
