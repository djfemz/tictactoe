package practice.courseAndStudent;

public class Course {
    private  Student [] students = new Student[100];
    private String courseName;
    private int numberOfStudents = 0;

    public Course(){

    }

    public Course(String courseName){
        this.courseName= courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }
}
