import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        System.out.println();        

        System.out.print("Please enter a number between -100 and +100, inclusive: ");
        Scanner keyboard = new Scanner(System.in);
        int userInput = keyboard.nextInt();
        
        while(!isInRange(userInput)) {
            System.out.println();
            System.out.printf("The number, %d, you entered is outside the range.\n", userInput);
            System.out.print("Please enter a number betwee -100 and +100, inclusive: ");
            userInput = keyboard.nextInt();
        }
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
