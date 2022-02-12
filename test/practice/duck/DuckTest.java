package practice.duck;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DuckTest {
    @Test
    public void duckCanBeCreatedTest(){
Duck duck = new Duck() {
    @Override
    public void performQuack() {
//    quackableBehaviour.quack();
    }

    @Override
    public void performFly() {

    }
};
assertNotNull(duck);
    }
@Test
    void testForMallardDuckCanQuack(){
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
}

@Test
    void testForMallardDuckCannotFly(){
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
}

@Test
    void mallardDuckFlyMethodCanBeSet(){
        Duck mallardDuck = new MallardDuck();
        mallardDuck.setFlyableBehaviour(new FlyWithWings());
}

}
