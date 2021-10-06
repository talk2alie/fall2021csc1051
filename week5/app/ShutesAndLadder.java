package app;

import games.Die;

public class ShutesAndLadder {
    public static void main(String[] args) {
        System.out.println();

        Die die = new Die(8);
        die.roll();
        System.out.println(die);

        System.out.println();
    }
}
