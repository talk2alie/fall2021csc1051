package bootcamp.app;

import java.io.IOException;

import bootcamp.data.Database;
import bootcamp.people.Instructor;
import bootcamp.people.Student;
import bootcamp.people.Title;

public class BootcampApp {
    public static void main(String[] args) throws IOException {
        System.out.println();

        Database database = new Database();

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
        database.printInstructors();

        System.out.println();
    }
}
