package app;

import bootcamp.courses.*;
import bootcamp.people.*;

public class iRegistrar {
    public static void main(String[] args) {
        System.out.println();

        Instructor instructor = new Instructor(123, "Abdul", "", "Jaffar");
        System.out.println(instructor);

        Student student = new Student(456, "Kadija", "Sando", "Pussah");
        System.out.println(student);

        Course course = new Course(1051, "CSC", "100", new Instructor(123, "Mohamed", "Alie", "Pussah"));
        course.setDescription("Data Structures & Algorithms");
        System.out.println(course);

        Enrollment enrollment = new Enrollment(23, 101, new Semester("Fall", 2021), "2021-08-27");
        System.out.println(enrollment);

        System.out.println();
    }
}
