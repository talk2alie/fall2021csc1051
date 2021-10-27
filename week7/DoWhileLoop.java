import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        System.out.println();        

        Scanner keyboard = new Scanner(System.in);
        int userInput;
        
        do {
            System.out.print("Please enter a number between -100 and +100, inclusive: ");
            userInput = keyboard.nextInt();
        } while(!isInRange(userInput));
        keyboard.close();

        System.out.println();
        System.out.printf("Yay! %d is a valid number!", userInput);
        System.out.println();

        System.out.println();
    }

    private static boolean isInRange(int userInput) {
        final int LOW = -100;
        final int HIGH = 100;
        return userInput >= LOW && userInput <= HIGH;
    }
}