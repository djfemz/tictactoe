package chapterThree;

public class HealthProfile {
    private String firstName;
    private String lastName;
    private int month;
    private int day;
    private int year;
    private String gender;
    private double height;
    private double weight;

    public HealthProfile(String firstName, String lastName, int month, int day, int year, String gender,
                         double height, double weight){
        this.firstName = firstName;
        this.lastName = lastName;
        this. month =month;
        this.day =day;
        this. year = year;
        this.gender = gender;
        this.height = height;
        this. weight = weight;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName){
        this. lastName = lastName;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getMaximumHeartRate(){
        int rate =   220- getAge();
        return rate;
    }

    public double getTargetHeartRate(){
        double heartRate = getMaximumHeartRate() * 0.85;
        return heartRate;
    }

    public int getAge(){
        int age =   2021- getYear();
        return age;
    }
    public double getBodyMassIndex(){
        double BMI = (getWeight() * 703)/(getHeight() * getHeight());
        return BMI;
    }
   ;
}
