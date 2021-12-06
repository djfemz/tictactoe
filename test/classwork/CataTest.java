package classwork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CataTest {

    @Test
    public void aGradeCanBeCalculated(){
        Cata cata = new Cata();
       char result = cata.calculateGradeFor(98);
       assertEquals('A', result);
    }

    @Test
    public void bGradeCanBeCalculated(){
        Cata cata = new Cata();
        char result = cata.calculateGradeFor(89);
        assertEquals('B', result);
    }

    @Test
    public void cGradeCanBeCalculated(){
        Cata cata = new Cata();
        char myResult = cata.calculateGradeFor(79);
        assertEquals('C', myResult);
    }

    @Test
    public void dGradeCanBeCalculated(){
        Cata cata = new Cata();
        char myResult = cata.calculateGradeFor(69);
        assertEquals('D', myResult);
    }

    @Test
    public void fGradeCanBeCalculated(){
        Cata cata = new Cata();
        char myResult = cata.calculateGradeFor(59);
        assertEquals('F', myResult);
    }


    @Test
    public void PriceOfQuantity(){
        Cata cata = new Cata();
        int myResult = cata.calculatePriceFor(4);
        assertEquals(4 * 2000, myResult);
    }

    @Test
    public void PriceOfQuantity2(){
        Cata cata = new Cata();
        int myResult = cata.calculatePriceFor(5);
        assertEquals(5 * 1800, myResult);
    }

    @Test
    public void PriceOfQuantity3(){
        Cata cata = new Cata();
        int myResult = cata.calculatePriceFor(29);
        assertEquals(29 * 1600, myResult);
    }

    @Test
    public void PriceOfQuantity4(){
        Cata cata = new Cata();
        int myResult = cata.calculatePriceFor(49);
        assertEquals(49 * 1500, myResult);
    }

    @Test
    public void PriceOfQuantity5(){
        Cata cata = new Cata();
        int myResult = cata.calculatePriceFor(99);
        assertEquals(99 * 1300, myResult);
    }

    @Test
    public void PriceOfQuantity6(){
        Cata cata = new Cata();
        int myResult = cata.calculatePriceFor(199);
        assertEquals(199 * 1200, myResult);
    }

    @Test
    public void PriceOfQuantity7(){
        Cata cata = new Cata();
        int myResult = cata.calculatePriceFor(359);
        assertEquals(359 * 1100, myResult);
    }

    @Test
    public void PriceOfQuantity8(){
        Cata cata = new Cata();
        int myResult = cata.calculatePriceFor(501);
        assertEquals(501 * 1000, myResult);
    }
}
