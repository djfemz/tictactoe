package practice;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        displayTwoSum(new int[]{1,2,3,4},5);
    }
    public static void displayTwoSum(int[] array, int number){
        int [] array2 = new int [2] ;
        for (int i = 0; i< array.length ; i++){
            for (int j = 1; j < array.length; j++){
                if (array[i] + array[j] == number){
                    array2 [0] = array[i];
                    array2 [1] = array[j];
                }
            }
        }
        System.out.println(Arrays.toString(array2));
    }
}
