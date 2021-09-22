import java.util.Scanner;

public class Trimmer {
    public static void main(String[] args) {
        System.out.println();

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter some text: ");
        String word = keyboard.nextLine();

        word = word.indent(5);
        System.out.println(word);

        keyboard.close();
        System.out.println();
    }
}
