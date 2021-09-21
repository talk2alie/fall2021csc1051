import java.util.Scanner;

public class AgeDisplayer {

    public static void main(String[] args) {
        System.out.println();

        Scanner console = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = console.nextLine();

        System.out.print("Please enter your age: ");
        int age = console.nextInt();

        console.close();

        System.out.printf("Your name is %s, and your age is %d.\n", name, age);

        System.out.println();
    }
}