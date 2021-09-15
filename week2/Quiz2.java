public class Quiz2 {
    public static void main(String[] args) {
        System.out.println();

        String name = "Me";

        System.out.println("About " + name);
        System.out.println("=============================================================================");
        System.out.println();

        byte age = 38;
        String major = "Computer Science";
        String graduationSemester = "Fall";
        short graduationYear = 2023;
        float height = 5.9F;
        double expectedAnnualSalary = 200_000;

        System.out.println("Age: " + age);
        System.out.println();

        System.out.print("I am a " + major + " major.");
        System.out.print(" I am expected to graduate in the " + graduationSemester);
        System.out.print(" of " + graduationYear + ".");
        System.out.println();

        System.out.print("I am " + height + " tall, and I hope to make up to $");
        System.out.println(expectedAnnualSalary + " when I graduate.");
        System.out.println();

        System.out.println("Thank you for reading.");

        System.out.println();
    }
}
