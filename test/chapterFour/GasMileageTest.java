package chapterFour;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GasMileageTest {

    @Test
    public void milesPerGallon(){
        GasMileage trip = new GasMileage();
        double perTrip = trip. milesPerGallonOfTrip(25.0, 8.0);
        assertEquals(25.0/8.0, perTrip);
    }

    @Test
    public void combinedMilesPerGallon(){
        GasMileage trip = new GasMileage();
        double allTrip = trip. milesPerGallonOfAllTrip(25.0, 8.0, 4);
        assertEquals((25.0/8.0) * 4, allTrip);
    }

    @Test
    public void AverageTripToCalculate(){
        GasMileage trip = new GasMileage();
        double averageTrip = trip. average(25.0, 8.0, 4);
        assertEquals(((25.0/8.0) * 4)/4, averageTrip);
    }
}
