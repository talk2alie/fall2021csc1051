import java.util.Random;
import java.util.Scanner;

/**
 * Quiz6
 */
public class Quiz6 {

    public static void main(String[] args) {
        System.out.println();

        System.out.println("Let's play Rock, paper, scissors.");
        System.out.println("Enter 1 for Rock, 2 for Scissors, and 3 for Paper.");
        System.out.print("Enter your choice to see who won: ");

        int computersPick = new Random().nextInt(3) + 1;

        Scanner scanner = new Scanner(System.in);
        int usersPick = scanner.nextInt();
        scanner.close();

        System.out.println();

        String usersChoice = getWordForChoice(usersPick);
        String computersChoice = getWordForChoice(computersPick);

        String winner = getWinner(usersChoice, computersChoice);
        if(usersChoice.startsWith("Error")) {
            System.out.println(usersChoice);
            System.out.println();
            return;
        }

        if(winner.equals("I")) {
            System.out.printf("\n%s beats %s, %s won!\n", computersChoice, usersChoice, winner);
        } 
        else {
            System.out.printf("\n%s beats %s, %s won!\n", usersChoice, computersChoice, winner);
        }

        System.out.println();
    }

    private static String getWordForChoice(int choice) {
        switch(choice) {
            case 1:
               return "Rock";
            case 2:
               return "Scissors";
            case 3:
                return "Paper";
            default:
                return "Error. Invalid choice";
        }
    }

    private static String getWinner(String usersChoice, String computersChoice) {
        if(userWon(usersChoice, computersChoice)) {
            return "you";
        } 

        return "I";
    }

    private static boolean userWon(String usersChoice, String computersChoice) {
        if(usersChoice.equals("Rock") && computersChoice.equals("Scissors")) {
            return true;
        }

        if(usersChoice.equals("Paper") && computersChoice.equals("Rock")) {
            return true;
        }

        if(usersChoice.equals("Scissors") && computersChoice.equals("Paper")) {
            return true;
        }

        return false;
    }
}