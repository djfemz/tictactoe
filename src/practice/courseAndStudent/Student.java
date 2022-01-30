package practice.courseAndStudent;

public class Student {
    private Course [] courses= new Course[7];
    private String name;
    private int numberOfCourses = 0;


    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course course) {
        courses[numberOfCourses] = course;
        numberOfCourses++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfCourses() {
        return numberOfCourses;
    }

    public void setNumberOfCourses(int numberOfCourses) {
        this.numberOfCourses = numberOfCourses;
    }
}
