import java.util.Scanner;

/**
 * Quiz3
 */
public class Quiz3 {

    public static void main(String[] args) {
        System.out.println();

        System.out.println();

        Scanner console = new Scanner(System.in);

        System.out.println("Please enter the 5 numbers: ");
    
        double num1, num2, num3, num4, num5;
        double num1 = console.nextDouble();
        double num2 = console.nextDouble();
        double num3 = console.nextDouble();
        double num4 = console.nextDouble();
        double num5 = console.nextDouble();

        console.close();
        
        double sum = num1 + num2 + num3 + num4 + num5;
        System.out.printf("The sum of %, %, %, %, and % is %d. \n", num1, num2, num3, num4, num5);

        System.out.println();

        System.out.println();
    }
}