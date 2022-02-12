package chapterEight;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class Time2Test {
   Time2  time;
    @BeforeEach
   public void setUp(){
        time = new Time2();
    }
    @Test
    public void timeCanBeCreatedTest(){

        time.haveAtime();
        assertTrue(true);
    }
   @Test
    public void secondsCanBeGotten(){
        Time2 time = new Time2(2);
        assertEquals(2,time.getSeconds());
   }
   @Test
    public void secondsCannotBeSetBeyond59(){
        Time2 time = new Time2(60);
        assertEquals(0,time.getSeconds());
   }

   @Test
    public void minutesCanBeGotten(){
        Time2 time = new Time2(1,0);
        assertEquals(1,time.getMinute());
   }
   @Test
    public void minutesBeyond_59_CannotBegotten(){
        Time2 time = new Time2(60,0);
        assertEquals(0,time.getMinute());
    }
    @Test
    public void hourCanBeGotten(){
        Time2 time = new Time2(1,0,0);
        assertEquals(1,time.getHour());
    }
    @Test
    public void hourBeyond_24_CannotBegotten(){
        Time2 time = new Time2(25,0,0);
        assertEquals(0,time.getHour());
    }


}
