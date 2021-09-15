public class Formmatting {
    public static void main(String[] args) {
        System.out.println();

        String name = "Mo";
        byte age = 38;
        double earningPotential = 1_000_000;
        System.out.printf("My name is %s. I am %d years old. I hope to earn %.2f by 2023.", name, 38, earningPotential);

        System.out.println();
    }
}
