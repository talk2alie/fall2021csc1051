import java.util.Scanner;

/**
 * Quiz3
 */
public class Quiz3 {

    public static void main(String[] args) {
        System.out.println();

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter 5 numbers: ");

        double num1, num2, num3, num4, num5;
        num1 = keyboard.nextDouble();
        num2 = keyboard.nextDouble();
        num3 = keyboard.nextDouble();
        num4 = keyboard.nextDouble();
        num5 = keyboard.nextDouble();

        double sum = num1 + num2 + num3 + num4 + num5;
        System.err.printf("The sum of %.1f, %.1f, %.1f, %.1f, and %.1f is %.1f\n", num1, num2, num3, num4, num5, sum);

        keyboard.close();

        System.out.println();
    }
}