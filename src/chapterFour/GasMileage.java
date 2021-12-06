package chapterFour;

public class GasMileage {
    public double milesPerGallonOfTrip(double miles, double gallon) {
        return (miles / gallon);

    }

    public double milesPerGallonOfAllTrip(double miles, double gallon, int trip) {
        return (miles / gallon) * trip;
    }

    public double average(double miles, double gallon, int trip) {
        return ((miles / gallon) * trip) / trip;
    }
}
