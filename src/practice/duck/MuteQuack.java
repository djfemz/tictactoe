package practice.duck;

public class MuteQuack implements QuackableBehaviour{
    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
