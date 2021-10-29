import java.util.Random;
import java.util.Scanner;

/**
 * Quiz 7
 */
public class Quiz7 {

    public static void main(String[] args) {
        System.out.println();

        String usersChoice = "";
        String computersChoice = "";
        Random random = new Random();
        String winner = "I";

        Scanner scanner = new Scanner(System.in);

        do {

            if(usersChoice.startsWith("Error")) {
                System.out.println("Your choice is invalid.");
            }
            else if((!usersChoice.isEmpty() && !computersChoice.isEmpty()) && usersChoice.equalsIgnoreCase(computersChoice)) {
                System.out.println("It was a tie. Let's go again.");
            } else {
                System.out.println("Let's play Rock, paper, scissors.");
            }
            
            System.out.println("Enter 1 for Rock, 2 for Scissors, and 3 for Paper.");
            System.out.print("Enter your choice to see who won: ");
            
            int computersPick = random.nextInt(3) + 1;
            int usersPick = scanner.nextInt();
            
            System.out.println();
            
            usersChoice = getWordForChoice(usersPick);
            computersChoice = getWordForChoice(computersPick);
            winner = getWinner(usersChoice, computersChoice);
        }
        while(usersChoice.startsWith("Error") || usersChoice.equalsIgnoreCase(computersChoice));
        scanner.close();

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