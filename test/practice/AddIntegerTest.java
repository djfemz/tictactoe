package practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddIntegerTest {

    @Test
    public void TestCanAddNumbers(){
        AddInteger adder = new AddInteger();
        int result = adder.add(6,-3);
        assertEquals(3, result);
    }

    @Test
    public void TestCanSubtractNumbers(){
        AddInteger adder = new AddInteger();
        int result = adder.subtract(6,-3);
        assertEquals(9, result);
    }

    @Test
    public void TestCanMultiplyNumbers(){
        AddInteger adder = new AddInteger();
        int result = adder.multiply(6,5);
        assertEquals(30, result);
    }


    @Test
    public void TestCanDivideNumbers(){
        AddInteger adder = new AddInteger();
        int result = adder.divide(6,3);
        assertEquals(2, result);
    }

    @Test
    public void TestCanGetModulesOfNumbers(){
        AddInteger adder = new AddInteger();
        int result = adder.modules(7,3);
        assertEquals(1, result);
    }
}