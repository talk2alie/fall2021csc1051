import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        System.out.println();

        /***
         * switch(<expression to match>) { case <value to match>: <statements> break;
         * case <value to match>: <statements> break; default: <statement> }
         */

        System.out.print("Please enter a character: ");
        Scanner scanner = new Scanner(System.in);
        String character = scanner.nextLine().trim().toUpperCase();
        scanner.close();

        switch (character) {
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
                System.out.println("It's a vowel");
                break;
            default:
                System.out.println("It's not a vowel");
        }

        System.out.println();
    }
}
