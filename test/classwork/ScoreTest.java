package classwork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScoreTest {

    @Test
    public void arraysTotalCanBeCalculatedTest(){
        int [] numbers = {1,2,3,4,5};
        int result = Score.calculateTotalOf(numbers);
        assertEquals(15, result);
    }

    @Test
    public void arraysMinimumNumberCanBeCalculatedTest(){
        int [] numbers = {1,2,3,4,5};
        int result = Score.calculateMinimumOf(numbers);
        assertEquals(1, result);
    }


    @Test
    public void arraysMaximumNumberCanBeCalculatedTest(){
        int [] numbers = {1,2,3,4,5};
        int result = Score.calculateMaximumOf(numbers);
        assertEquals(5, result);
    }


    @Test
    public void arraysAverageNumberCanBeCalculatedTest(){
        int [] numbers = {1,2,3,4,5};
        int result = Score.calculateAverageOf(numbers);
        assertEquals(3.0, result);
    }

}
