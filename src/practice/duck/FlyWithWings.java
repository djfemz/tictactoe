package practice.duck;

public class FlyWithWings implements FlyableBehaviour {
    @Override
    public void fly() {
        System.out.println("I am flying with wings");
    }
}
