package practice.duck;

public class MallardDuck extends Duck {
    public MallardDuck(){

        flyableBehaviour = new FlyNoWay();
        quackableBehaviour = new Quack();
    }


    @Override
    public void performQuack() {
        quackableBehaviour = new Quack();
    }

    @Override
    public void performFly() {
        flyableBehaviour = new FlyNoWay();
    }
}
