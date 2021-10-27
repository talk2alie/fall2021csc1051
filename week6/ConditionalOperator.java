import java.util.Scanner;

public class ConditionalOperator 
{
    public static void main(String[] args) 
    {
        System.out.println();    /**
         *  <boolean expression> ? <value if true> : <value if false>
         */


         Scanner scanner = new Scanner(System.in);
         System.out.print("Please enter a number and I will tell you if it's even: ");
         long userInput = scanner.nextLong();

         boolean result = isEven(userInput);

        System.out.println(result ? "It's even" : "It's not even");
    }

    public static boolean isEven(long number) {
        if(number % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isFirstLetterVowel(String text) {
        String firstLetter = text.substring(0, 1).toUpperCase();

        // switch(firstLetter) {
        //     case "A":
        //     case "E":
        //     case "I":
        //     case "O":
        //     case "U":
        //         return true;
        //     default:
        //         return false;
        // }

        if(firstLetter.equalsIgnoreCase("A") || 
           firstLetter.equalsIgnoreCase("E") || 
           firstLetter.equalsIgnoreCase("I") || 
           firstLetter.equalsIgnoreCase("O") || 
           firstLetter.equalsIgnoreCase("U")) 
        {
            return true;
        }
        else {
            return false;
        }
    }
}
