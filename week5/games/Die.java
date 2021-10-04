package games;

import java.util.Random;

public class Die {
    private int sides;
    private int value;

    public Die() {
        this(6);
    }

    public Die(int sides) {
        this.sides = sides;
        value = -1;
    }

    public int roll() {
        value = new Random().nextInt(sides) + 1;
        return getValue();
    }

    public int getValue() {
        return value;
    }

    public String toString() {
        return value + "";
    }
}
