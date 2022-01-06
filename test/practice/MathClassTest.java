package practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathClassTest {

    @Test
    public void power(){
        MathClass math =new MathClass();
        double result = math.power(10,3);
        assertEquals(1000.0, result);
    }

    @Test
    public void squareRoot(){
        MathClass math = new MathClass();
        double result = math.squareRoot(121);
        assertEquals(11, result);
    }
}
