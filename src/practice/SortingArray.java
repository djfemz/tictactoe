package practice;

import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {

        int[] number = {5, 6, 2, 3, 10, 19, 1, 32, 16, 60};

        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(sortIntegers(number))); ;
    }
    public static int [] sortIntegers(int[] array) {
        int sortedArray;
        boolean checkNumber = true;
        int[] array2 = new int[array.length];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = array[i];
        }
        while (checkNumber) {
            checkNumber = false;
            for (int i = 0; i < array2.length - 1; i++) {
                if (array2[i] < array2[i + 1]) {
                    sortedArray = array2[i];
                    array2[i] = array2[i + 1];
                    array2[i + 1] = sortedArray;
                    checkNumber = true;
                }
               // System.out.print(sortedArray + " ");
            }
        }

return array2;
    }
}
