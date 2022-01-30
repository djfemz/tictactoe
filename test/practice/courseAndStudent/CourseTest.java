package practice.courseAndStudent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {
    @Test
    public void numberOfCourseTest(){
        Student john = new Student();
        Course java = new Course("java");
        Course python = new Course("python");
        Course c = new Course("c");
        Course php = new Course("php");

      john.setCourses(java);
      john.setCourses(python);
      john.setCourses(c);
      john.setCourses(php);

      assertEquals(4, john.getNumberOfCourses());
    }

    @Test
    public void numberOfStudentsTest(){
        Course java = new Course();
        Student esther = new Student();
        Student jacinta = new Student();
        Student judith = new Student();
        Student adeola = new Student();

        java.setStudents(esther);
        java.setStudents(jacinta);
        java.setStudents(judith);
        java.setStudents(adeola);

        assertEquals(4,java.getNumberOfStudents());
    }

}