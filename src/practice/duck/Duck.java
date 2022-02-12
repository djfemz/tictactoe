package practice.duck;

public abstract class Duck {
    FlyableBehaviour flyableBehaviour;
    QuackableBehaviour quackableBehaviour;


    public void setFlyableBehaviour(FlyableBehaviour flyableBehaviour) {
        this.flyableBehaviour = flyableBehaviour;
    }

    public void setQuackableBehaviour(QuackableBehaviour quackableBehaviour) {
        this.quackableBehaviour = quackableBehaviour;
    }


    public abstract void performQuack();

    public abstract void performFly();
}
