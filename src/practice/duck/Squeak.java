package practice.duck;

public class Squeak implements QuackableBehaviour{
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
