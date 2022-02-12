package practice.duck;

public class FlyNoWay implements FlyableBehaviour {

    @Override
    public void fly() {
        System.out.println("i can't fly");
    }
}
