package chapterSeven;

public class ArrayStatement {
    public static void main(String[] args) {
        int [] array = {35,11,63,13,140,15,16,120,18,72,20};
        for(int i = 0; i < array.length;i++){
            if (array[i] >=10 && array[i] < 21) {
                array[i] = 0;
            }
        System.out.print(array[i] +" ");
        }
    }
}
