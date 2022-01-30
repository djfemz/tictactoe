package classwork;

public class PythonArrayList {
    public static void main(String[] args) {
      String [][] array= {{"Banana", "Orange", "Mango"},{"Banana1", "Orange1", "Mango1"},
              {"Banana2", "Orange2", "Mango2"}} ;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 2; i >= 0 ; i--) {
            for (int j = 2; j >= 0 ; j--) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 2; i >= 0; i--) {
            for (int j = 2; j >= 0 ; j--) {
                System.out.print(array[j][i] + "  ");
            }
            System.out.println();
        }
    }

}
