package classwork;

public class Loop {
    public static void main(String[] args) {

       for(int column = 1, k=6 ; column <= 6; column++, k--){
           // int k = 0;
           int p = k;
           for (int row = 1; row <= column ; row++){
               System.out.print("  ");

           }
           for (int row = column; row <= 6; row++) {
               System.out.print(p-- + " ");

           }
           System.out.println();
       }

    }
}

