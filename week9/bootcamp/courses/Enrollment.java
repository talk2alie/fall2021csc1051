package bootcamp.courses;

import java.time.LocalDate;

public class Enrollment {
    private int studentId;
    private int classNumber;
    private Semester semester;
    private LocalDate date;

    public Enrollment(int studentId, int classNumber, Semester semester, String date) {
        this.studentId = studentId;
        this.classNumber = classNumber;
        this.semester = semester;
        this.date = LocalDate.parse(date.toString());
    }

    public String toString() {
        return String.format("Student Id: %d, CourseId: %d, Semester: %s, Enrollment Date: %s", studentId, classNumber, semester, date);
    }
}
