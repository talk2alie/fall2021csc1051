package bootcamp.people;

import java.util.HashSet;

import bootcamp.courses.Enrollment;

public class Student extends Person implements FullName {
    private int enrollmentId;
    private HashSet<Enrollment> enrollments;

    public Student(int enrollementId, String firstName, String middleName, String lastName) {
        this.enrollmentId = enrollementId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.enrollments = new HashSet<>();
    }

    public int getEnrollmentId() {
        return enrollmentId;
    }

    public void addEnrollment(Enrollment enrollment) {
        enrollments.add(enrollment);
    }    

    public String getFullName() {
        return String.format("%s%s%s",firstName, middleName == null || middleName.length() == 0 ? " " : " " + middleName + " ", lastName);
    }
}
