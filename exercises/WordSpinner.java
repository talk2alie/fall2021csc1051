// An import statement is needed for any class you use
// outside of the current package or the java.lang package
import java.util.Scanner;

/**
 * WordSpinner - Asks a user for a word and then swaps
 *               all letters to left of the center character
 *               with all letters to the right of the center 
 *               chracter
 */
public class WordSpinner {
    public static void main(String[] args) {
        // This is for padding. It prints an empty line at the top
        System.out.println(); 

        // 1. Ask the user for a word. Note the space after the colon
        System.out.print("Please enter a word: ");

        /*
            2. Create a scanner object. 
               Note that you need the import statement at the top of the file
               for this to work
        */
        Scanner userInput = new Scanner(System.in);

        // 3. User the scanner object to read your user's inputted word and save it to a variable
        String word = userInput.nextLine();

        /* 
            4. Remove all empty spaces from the user's word. 
               The user's entered word might have empty spaces if she pressed the spacebar
               before pressing the Enter key on her keyboard. Use the trim() method of the 
               String object to remove all blanks spaces at the beginning and end of a string

               Note that because strings are immutable, I had to reassign the new string, after 
               trimming it back to the word variable
        */
        word = word.trim();

        /*
            5. Find the character at the center of the word

            Note that because the length() method return an int and I am dividing by 
            int, this is integer division; therefore, Java will truncate any decimal 
            place. So if the word had 5 characters, the center character will be at 
            the index, 2.
        */
        int centerCharacterIndex = word.length() / 2;

        // 6. Grab all characters to the left of the center character
        String charactersToTheLeftOfTheCenterCharacter = word.substring(0, centerCharacterIndex);
        
        // 7. Grab the center chracter
        char centerCharacter = word.charAt(centerCharacterIndex);

        // 8. Grab all character to the right of the center chracter
        // Note: I added 1 to the center character index because we want to all characters
        //       immediately after the center character, but not the center character
        String charactersToTheRightOfTheCenterCharacter = word.substring(centerCharacterIndex + 1);

        /*
            9. Use the printf method to print out the rotated word
               
            Pay attention to the format specifiers and the positions of the variables that
            will replace them. The first %s corresponds to the first varibale after the first 
            comma, the second %s corresponds to the 2nd variable and so forth

            Note also that I have used %s, not %d (for integers) or %f (for floating-point). 
            %s can be use for String or char

            Also, note the \n at the end. This is the newline character. The printf method, 
            like the print method, does not print a newline character after it prints the 
            formatted text. Only the println method prints the extra newline character
        */
        System.out.printf("%s%s%s\n", charactersToTheRightOfTheCenterCharacter, centerCharacter, charactersToTheLeftOfTheCenterCharacter);

        // 10. Close the Scanner object. 
        //     This will become more important when we start reading from files
        userInput.close();

        // This is for padding. It prints an empty line at the bottom
        System.out.println();
    }
}