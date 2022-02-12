package practice.duck;

public class Quack implements QuackableBehaviour{
    @Override
    public void quack() {
        System.out.println("Quack");
    }

}
