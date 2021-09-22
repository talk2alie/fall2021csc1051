import java.util.*;

public class Repeater {
    public static void main(String[] args) {
        System.out.println();

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter a word to scramble: ");
        String word = keyboard.nextLine();

        Random random = new Random();
        int index = random.nextInt(word.length());
        System.out.printf("The index is %d\n", index);

        String letter = word.substring(index, index + 1);
        System.out.printf("The letter is %s\n", letter);

        String letters = letter.repeat(word.length());

        word = letters.concat(word).concat(letters);
        System.out.println(word);
        
        keyboard.close();
        System.out.println();
    }
}
