import java.util.Scanner;

/**
 * WhileLoop
 */
public class WhileLoop {

    public static void main(String[] args) {
        System.out.println();

        // int number = 20;
        // while(number >= 0) {
        //     System.out.println(number);
        //     number--;
        // }


        // int count = 0;
        // int number = 1;
        // while(count < 20) {
        //     if(number % 2 == 0) {
        //         System.out.println(number);
        //         number++;
        //         count++;
        //     } else {
        //         number++;
        //     }
        // }

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter a word and I will tell you if it's a palindrome: ");
        String word = keyboard.nextLine().trim();
        keyboard.close();

        System.out.println(isPalindrome(word));

        System.out.println();
    }

    private static boolean isPalindrome(String word) {
        int frontIndex = 0;
        int backIndex = word.length() - 1;
        while(frontIndex < backIndex) {
            if(word.charAt(frontIndex) != word.charAt(backIndex)) {
                return false;
            }
            frontIndex++;
            backIndex--;
        }

        return true;
    }
}