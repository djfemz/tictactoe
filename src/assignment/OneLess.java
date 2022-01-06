package assignment;

public class OneLess {
    public static void main(String[] args) {
        int [] array = {3,4,2,5,1};
        int total = 0;

        for (int i = 0; i < array.length; i++){
            total = total + array[0];

        }
        int y = total;
        int maximumNumber = array[0];
        int minimumNumber = y;


        for(int z = 0; z < array.length; z++){
             y = total - array[z];
            maximumNumber =Math.max(maximumNumber, y);
            minimumNumber =Math.min(minimumNumber, y);
        }

        System.out.println("Maximum Number is " +maximumNumber);
        System.out.println("Minimum Number is " +minimumNumber);

    }
}
