package chapterThree;

public class HeartRates {

        private String firstName;
        private String lastName;
        private int month;
        private int day;
        private int year;

        public HeartRates(String firstName, String lastName, int month, int day, int year){
                this.firstName = firstName;
                this.lastName = lastName;
                this. month =month;
                this.day =day;
                this. year = year;
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

}
