import java.util.Random;
import java.util.Scanner;

/**
 * SecretCodeGenerator
 */
public class SecretCodeGenerator {

    public static void main(String[] args) {
        System.out.println();

        final int upperBound = 201;
        final int lowerBound = -100;
        Random numberGenerator = new Random();
        int secretNumber1 = lowerBound + numberGenerator.nextInt(upperBound);
        int secretNumber2 = lowerBound + numberGenerator.nextInt(upperBound);

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter a secret word: ");
        String secretWord = keyboard.nextLine().trim();
        keyboard.close();

        int firstIndex = numberGenerator.nextInt(secretWord.length());
        int secondIndex = numberGenerator.nextInt(secretWord.length());
        char characterAtFirstIndex = secretWord.charAt(firstIndex);
        char characterAtSecondIndex = secretWord.charAt(secondIndex);

        secretWord = secretWord.replaceFirst(characterAtFirstIndex + "", secretNumber1 + "");
        secretWord = secretWord.replaceFirst(characterAtSecondIndex + "", secretNumber2 + "");

        System.out.println("Your secret passcode is " + secretWord);

        System.out.println();
    }
}
