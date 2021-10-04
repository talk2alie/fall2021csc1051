import java.util.Random;

public class RandomCharactersComplete {
    public static void main(String[] args) {
        System.out.println();

        final String CHARACTERS = "abcdefghijklmnopqrstuvwxyz0123456789";

        Random randomNumberGenerator = new Random();

        int firstIndex, secondIndex, thirdIndex, forthIndex, fifthIndex;

        /*
            1. Write code here that assigns a random number between 0 and 36 (inclusive)
            in each of the variables above
        */
        firstIndex = randomNumberGenerator.nextInt(37);
        secondIndex = randomNumberGenerator.nextInt(37);
        thirdIndex = randomNumberGenerator.nextInt(37);
        forthIndex = randomNumberGenerator.nextInt(37);
        fifthIndex = randomNumberGenerator.nextInt(37);

        /* 
            2. Write code here that assembles a string from characters collected from 
               the CHARACTERS variable above, using the five index you generated in 
               question 1

               CONSTRINT: Use the String.format method to assemble your characers into 
                          the randomCharacters variable
        */
        char firstCharacter = CHARACTERS.charAt(firstIndex);
        char secondCharacter = CHARACTERS.charAt(secondIndex);
        char thirdCharacter = CHARACTERS.charAt(thirdIndex);
        char forthCharacter = CHARACTERS.charAt(forthIndex);
        char fifthCharacter = CHARACTERS.charAt(fifthIndex);
        String randomCharacters = String.format("%s%s%s%s%s", firstCharacter, secondCharacter, thirdCharacter, forthCharacter, fifthCharacter);

        // Write code that prints the text: Your random characters formed the word, "<randomCharacters>."
        System.out.printf("Your random characters formed the word, \"%s.\"\n", randomCharacters);

        System.out.println();;
    }
}
