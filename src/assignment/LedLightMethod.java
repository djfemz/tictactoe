package assignment;

public class LedLightMethod {
private int [][] array = new int [5][4];
    private boolean isOn;

    public LedLightMethod(){}
    public boolean isOn() {return isOn;
    }

    public boolean turnOn(String numbers) {
        if(numbers.charAt(numbers.length()-1) == '1') {
            return isOn=true;
        }
        return isOn=false;
    }

    public void turnOff() { isOn = false;
    }

    public void turnOnSideA(String numbers) {

            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < 4; j++) {
                    array[i][j] = 1;
                }
            }
        }


    public int[][] getArray() {
        return array;
    }

    public void turnOnSideB(String numbers) {
        for(int i = 0; i< 3 ; i++){
            for(int j = 3; j < 4; j++){
                array[i][j] = 1;
            }
        }
    }

    public void turnOnSideC(String numbers) {

        for(int i = 2; i< 5 ; i++){
            for(int j = 3; j < 4; j++){
                array[i][j] = 1;
            }
        }
    }

    public void turnOnSideD(String numbers) {

        for(int i = 4; i< 5 ; i++){
            for(int j = 0; j < 4; j++){
                array[i][j] = 1;
            }
        }
    }

    public void turnOnSideE(String numbers) {
        for(int i = 2; i< 5 ; i++){
            for(int j = 0; j < 1; j++){
                array[i][j] = 1;
            }
        }
    }

    public void turnOnSideF(String numbers) {

        for(int i = 0; i< 3 ; i++){
            for(int j = 0; j < 1; j++){
                array[i][j] = 1;
            }
        }
    }

    public void turnOnSideG(String numbers) {

        for(int i = 2; i < 3 ; i++){
            for(int j = 0; j < 4; j++){
                array[i][j] = 1;
            }
        }
    }
}
