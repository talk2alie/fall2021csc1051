import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Quiz8
 */
public class Quiz8 {

    public static void main(String[] args) throws IOException {
        final String fileName = "C:\\Repos\\fall2021csc1051\\week8\\data.txt";
        String[] data = { "I am a girl. I live up the river", "From where the stream runs",
                "I see the sun and hear the beever", "Yet I can't get visitors who are nuns", "What say yee?" };
        save(data, fileName);
        String[] readData = read(fileName);
        print(readData);
    }

    private static void print(String[] readData) {
        for (int i = 0; i < readData.length; i++) {
            System.out.println(readData[i]);
        }
    }

    private static String[] read(String fileName) throws IOException {
        File file = new File(fileName);
        Scanner reader = new Scanner(file);

        String[] data = new String[100];
        int count = 0;
        while(reader.hasNextLine()) {
            String line = reader.nextLine();
            data[count] = line;
            count++;
        }
        reader.close();
        return data;
    }

    private static void save(String[] items, String fileName) throws IOException {
        PrintWriter writer = new PrintWriter(new File(fileName));
        for (int i = 0; i < items.length; i++) {
            writer.println(items[i]);
        }
        writer.close();
    }

}

