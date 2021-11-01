package bootcamp.data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import bootcamp.people.Instructor;
import bootcamp.people.Student;

public class Database {
    private final File studentsTable;
    private final File instructorsTable;

    public Database() {
        studentsTable = new File("bootcamp/data/students.tbl");
        instructorsTable = new File("bootcamp/data/instructors.tbl");
    }

    public void printStudents() throws FileNotFoundException {
        Scanner reader = new Scanner(studentsTable);
        while(reader.hasNextLine()) {
            System.out.println(reader.nextLine());
        }
        reader.close();
    }

    public void printInstructors() throws FileNotFoundException {
        Scanner reader = new Scanner(instructorsTable);
        while(reader.hasNextLine()) {
            System.out.println(reader.nextLine());
        }
        reader.close();
    }

    public void saveInstructor(Instructor instructor) throws IOException {
        PrintWriter writer = new PrintWriter(instructorsTable);
        writer.println(instructor.toTable());
        writer.close();
    }

    public void saveStudent(Student student) throws IOException {
        FileWriter writer = new FileWriter(studentsTable, true);
        writer.append("\n");
        writer.append(student.toTable());
        writer.close();
    }
}
