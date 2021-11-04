package bootcamp.app;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WritingToFiles {
    public static void main(String[] args) throws IOException {
        System.out.println();


        File file = new File("C:\\Repos\\fall2021csc1051\\week7\\bootcamp\\data\\students.tbl");
        FileWriter fileWriter = new FileWriter(file, true);
        fileWriter.append("\n5,Beverly,,Barlow\n");
        fileWriter.close();


        // PrintWriter writer = new PrintWriter("C:\\Repos\\fall2021csc1051\\week7\\bootcamp\\data\\students.tbl");
        // writer.println("1,Allison,,Blake");
        // writer.println("2,Jack,,Carter");
        // writer.println("3,Kevin,,Blake");
        // writer.close();


        System.out.println();
    }
}
