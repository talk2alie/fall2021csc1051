package bootcamp.courses;

import java.util.HashSet;

import bootcamp.people.Instructor;
import bootcamp.people.Student;

public class Course {
    private int number;
    private String title;
    private String section;
    private String description;
    private Instructor instructor;
    private HashSet<Enrollment> enrollments;

    public Course(int number, String title, String section, Instructor instructor) {
        this.number = number;
        this.title = title;
        this.section = section;
        enrollments = new HashSet<>();
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void changeInstructor(Instructor newInstructor) {
        instructor = newInstructor;
    }

    public void enrollStudent(Enrollment enrollment, Student student) {
        student.addEnrollment(enrollment);
        enrollments.add(enrollment);
    }

    public String toString() {
        return String.format("%s %d - %s | Instructor: %s", title, number, section, instructor);
    }
}
