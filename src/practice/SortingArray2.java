package practice;

import java.util.Arrays;

public class SortingArray2 {
    public static void main(String[] args) {
        int[] array = {9, 4, 5, 8, 3, 1, 7, 16, 18, 99, 2};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.print(Arrays.toString(sortArray(array)));
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[j] > array[i]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
                    System.out.print(array[i]+ " ");
        }
    }
    private static int [] sortArray(int [] array){
        int[] array2 = new int[array.length];
        for (int i = 0; i < array2.length-1; i++) {
            int maximum = i;
            for (int j = i+1; j < array2.length; j++) {
                if (array2[j]< array2[maximum] ){
                    maximum = j;
                    int temp = array2[maximum];
                    array2[maximum] = array2[i];
                    array2[i] = temp;
                }
                else break;
            }
        }
       return array2;
        //return 0;
    }

    private static int[] sortArray2(int [] array){
        int [] array1 ={array.length};
        return array1;
    }


}
