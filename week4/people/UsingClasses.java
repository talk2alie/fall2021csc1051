package people;
public class UsingClasses {
    public static void main(String[] args) {
        System.out.println();

        Person person1 = new Person("John", "A", "Doe", 2002, 5.7F, "N/A", 100);
        person1.setEnergyLevel(10000);

        

        System.out.println(person1.getEnergyLevel());

        System.out.println();
    }

    public static double add(double x, double y) {
        double sum = x + y;
        return sum;
    }
}

