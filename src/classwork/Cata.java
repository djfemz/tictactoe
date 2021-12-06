package classwork;

public class Cata {
    public char calculateGradeFor(int score) {
        if (score > 89) return 'A';
        if (score > 79) return 'B';
        if (score > 69) return 'C';
        if (score > 59) return 'D';
        return 'F';
    }

    public int calculatePriceFor(int Quantity) {
        if (Quantity > 499) {
            return (Quantity * 1000);
        }
        if (Quantity >= 200) {
            return (Quantity * 1100);
        }
        if (Quantity >= 100) {
            return (Quantity * 1200);
        }
        if (Quantity >= 50) {
            return (Quantity * 1300);
        }
        if (Quantity >= 39) {
            return (Quantity * 1500);
        }
        if (Quantity >= 10) {
            return (Quantity * 1600);
        }
        if (Quantity >= 5) {
            return (Quantity * 1800);
        }

           return (Quantity * 2000);
    }
}
