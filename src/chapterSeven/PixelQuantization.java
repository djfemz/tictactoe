package chapterSeven;

public class PixelQuantization {
    public static void main(String[] args) {

int [] array = {101, 35, 64, 200, 67, 95, 52, 22, 9, 99};
 for (int i = 0; i < array.length ;i++){
     if (array[i] > 180) System.out.print(190 + " ");
     else if (array[i] >= 161 && array[i] <= 180) System.out.print(170 + " ");
     else if (array[i] >= 141 && array[i] <= 160) System.out.print(150 + " ");
     else if (array[i] >= 121 && array[i] <= 140) System.out.print(130 + " ");
     else if (array[i] >= 101 && array[i] <= 120) System.out.print(110 + " ");
 else if (array[i] >= 81 && array[i] <= 100) System.out.print(90 + " ");
 else if (array[i] >= 61 && array[i] <= 80) System.out.print(70 + " ");
 else if (array[i] >= 41 && array[i] <= 60) System.out.print(50 + " ");
 else if (array[i] >= 21 && array[i] <= 40) System.out.print(30 + " ");
 else  System.out.print(10 + " ");

 }
    }
}
