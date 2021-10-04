package app;

import games.Die;

public class ShutesAndLadder {
    public static void main(String[] args) {
        System.out.println();

        Die die = new Die(100);
        int dieValue = die.roll();
        System.out.println(dieValue);


        System.out.println();
    }
}
