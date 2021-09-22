import java.util.Random;
import java.util.Scanner;

public class WordScrambler {
    public static void main(String[] args) {
        System.out.println();

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter a word to scramble: ");
        String word = keyboard.nextLine();

        Random random = new Random();
        int firstIndex = random.nextInt(word.length());
        System.out.printf("The first index is %d\n", firstIndex);

        int secondIndex = random.nextInt(word.length()); 
        System.out.printf("The second index is %d\n", secondIndex);

        char firstCharacter = word.charAt(firstIndex);
        System.out.printf("The first character is %s\n", firstCharacter);

        char secondCharacter = word.charAt(secondIndex);
        System.out.printf("The second character is %s\n", secondCharacter);

        word = word.replace(firstCharacter, secondCharacter);
        System.out.printf("The scrambled word is %s\n", word);

        keyboard.close();
        System.out.println();
    }
}
