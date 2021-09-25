import java.util.*;

/**
 * Repeater
 */
public class Repeater {
    public static void main(String[] args) {
        System.out.println();

        Scanner console = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String word = console.nextLine();
        System.out.println(word);

        Random random = new Random();
        int firstIndex = random.nextInt(word.length());
        int secondIndex = random.nextInt(word.length());

        char firstCharacter = word.charAt(firstIndex);
        char secondCharacter = word.charAt(secondIndex);

        String repeatedFirstCharacter = (firstCharacter + "").repeat(word.length());
        

        System.out.println();
    }
}