// Step 1: Import the Scanner class from the java.util package
import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {
        System.out.println();

        /* 
            Step 2. Instantiate a Scanner object
                System.in is an object in the System class that holds a reference
                to a user's keyboard or the main input device on the user's system
        */
        Scanner keyboard = new Scanner(System.in);

        // Step 3: Ask the user for the piece of information you want
        System.out.print("Please enter your name: ");

        /* 
            Step 4: Read the user's input, after they press the Enter key,
            and store the result in a variable so you can use it later

            NOTE: The data type of the variable you are using to store the 
                  user's input MUST be compatible with the data type you are 
                  asking for.

                  For example, if you are asking for a name, you MUST use the nextLine() 
                  method of the Scanner object. If you are asking for a whole number, 
                  you MUST use the nextInt() method and store the value in a compatible
                  variable
        */
        String name = keyboard.nextLine();

        // Step 5: Use the value
        System.out.printf("Your name is %s\n", name);

        // Step 6 (Optional): Close the Scanner object
        keyboard.close();

        System.out.println();
    }
}
