import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.Period;
import java.util.ArrayList;
import java.util.Scanner;

public class Lists {
    public static void main(String[] args) {
        System.out.println();

        System.out.println();
    }

    private static void save(ArrayList<String> items, String fileName) throws IOException {
        PrintWriter writer = new PrintWriter(fileName);
        for (int i = 0; i < items.size(); i++) {
            writer.println(items.get(i));
        }
        writer.close();
    }

    private ArrayList<String> read(String fileName) throws IOException {
        File file = new File(fileName);
        Scanner reader = new Scanner(file);
        ArrayList<String> data = new ArrayList<>();
        int index = 0;
        while(reader.hasNextLine()) {
            data.add(index, reader.nextLine());
            index++;
        }
        reader.close();
        return data;
    }
}
