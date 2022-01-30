package classwork;

import org.junit.jupiter.api.Test;

public class Time1Test {
    @Test
    public void testNoArgConstructor(){
        Time1 newTime = new Time1();
        newTime.setTime(23,12,70);
        newTime.toString();

    }
}
