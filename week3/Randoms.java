import java.util.*;

public class Randoms {
    public static void main(String[] args) {
        System.out.println();

        Random random = new Random();
        int randomNumber = 50 + random.nextInt(51);
        long randomNumber2 = random.nextLong();

        double randomDouble = random.nextDouble();
        System.out.println(randomDouble);



        System.out.println();
    }
}
