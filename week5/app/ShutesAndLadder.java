package app;

import games.Die;

public class ShutesAndLadder {
    public static void main(String[] args) {
        System.out.println();

        Die die = new Die(8);
        System.out.println(die);

        Die die2 = new Die();
        System.out.println(die2);

        System.out.println(die.equals(die2));
        

        System.out.println();
    }
}
