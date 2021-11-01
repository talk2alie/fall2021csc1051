package bootcamp.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

import bootcamp.data.Database;
import bootcamp.people.Instructor;
import bootcamp.people.Student;
import bootcamp.people.Title;

public class BootcampApp {
    public static void main(String[] args) throws IOException {
        System.out.println();

        /*Database database = new Database();

        System.out.println("Students");
        database.printStudents();
        System.out.println();

        Student student = new Student(11, "Obedayor", "Mallisson", "Brown");
        database.saveStudent(student);
        System.out.println("Students after adding Obedayor");
        database.printStudents();

        System.out.println();
        System.out.println("Instructors");
        database.printInstructors();

        Instructor i = new Instructor(Title.Dr, 12, "Abdul", null, "Oketona");
        database.saveInstructor(i);
        System.out.println();
        System.out.println("Instructors after add");
        database.printInstructors();*/

        Student[] students = new Student[11];

        File studentsFile = new File("bootcamp\\data\\students.tbl");
        Scanner scanner = new Scanner(studentsFile);
        if(scanner.hasNextLine()) {
            scanner.nextLine();
        }
        while(scanner.hasNextLine()) {
           String line = scanner.nextLine();
           String[] tokens = line.split(",");
           String enrollmentId = tokens[0];
           String firstName = tokens[1];
           String middleName = tokens[2];
           String lastName = tokens[3];
           Student currentStudent = new Student(Integer.parseInt(enrollmentId), firstName, middleName, lastName);
           students[currentStudent.getEnrollmentId() - 1] = currentStudent;
        }
        scanner.close();


        System.out.println();
    }
}
