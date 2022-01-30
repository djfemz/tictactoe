package chapterFive;

public class PythagoreanTriples {
    public static void main(String[] args) {
        int a;
        display("Hypotenuse\tSide1\tSide2");
        for (int i = 1; i < 500; i++) {
            for (int j = 1; j <i ; j++) {
                for (int k = 1; k < j; k++) {
                  a =(int) Math.pow(j,2) + (int)Math.pow(k,2);
                  if (a== (int)Math.pow(i,2)){
                      display(i+  "^2\t\t\t" +j+ "^2\t\t "+k+ "^2");
                  }
                }
            }
        }

    }
    public static void display(String message){
        System.out.println(message);
    }
}
