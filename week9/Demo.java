import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import bootcamp.people.FullName;
import bootcamp.people.Instructor;
import bootcamp.people.Student;
import bootcamp.people.Title;

public class Demo {
    public static void main(String[] args) {
        System.out.println();

        String[] names = {"Alpha"};
        
        try {
            File file = new File("somefile.txt");
            Scanner scanner = new Scanner(file);
            System.out.println(names[0]);
        } catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println("You tried to access an index that doesn't exist.");
        } catch(FileNotFoundException ex) {
            System.out.println(ex.getStackTrace());
        } catch(Exception ex) {
            System.out.println("");
        }

        // Student student = new Student(1, "Jacob", null, "Old Testament");
        // System.out.println(student.toString());
        // var instructor = new Instructor(1, Title.Dr, "Abdul", "Rasheed", "Oketona");
        // print(student);

        // var instructor = new Instructor(1, Title.Dr, "Abdul", "Rasheed", "Oketona");
        // var instructor1 = new Instructor(2, Title.Mr, "Samsudeen", "", "Oketona");
        // var instructor2 = new Instructor(3, Title.Ms, "Teresa", "", "Norwood");
        // var instructor3 = new Instructor(4, Title.Professor, "Kristen", "", "Obermyer");

        

        // Student student = new Student(1, "Jacob", null, "Old Testament");
        // Student student1 = new Student(1, "Isaac", null, "Old Testament");
        // print(student);

        // Object student2 = new Student(3, "Facundo", null, "Morrisson");
        // Student student3 = (Student) new Object();

        // ArrayList<Object> instructors = new ArrayList<>();
        // instructors.add(instructor);
        // instructors.add(student);
        // print(instructors);

        System.out.println();
    }

    // private static void print(ArrayList<Object> items) {
    //     for (Object object : items) {
    //         print(object);
    //     }
    // }

    // private static void print(Object item) {
    //     System.out.println(item.toString());
    // }

    private static void print(FullName name) {
        System.out.println(name.getFullName());
    }
}
