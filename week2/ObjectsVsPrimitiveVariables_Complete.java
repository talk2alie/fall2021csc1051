public class ObjectsVsPrimitiveVariables_Complete {
    public static void main(String[] args) {
        System.out.println();

        /*
            A primitive variable is a variable created from a primitive data type,
            byte, short, int, long, float, double, boolean, char

            Primitive variables do not share state. This means if a value is copied
            from one primitive variable to another, the 2 variables still remain 
            independent and disconnected from one another. Any change made to one 
            does not affect the other.

            E.g. Create 2 primitive variables and copy the value of one to the other
        */
        int numberOfStudents = 28;
        int largeClassSize = numberOfStudents;

        // Print the 2 variables to show they have the same value at this point
        System.out.printf("numberOfStudents has the value: %d\n", numberOfStudents);
        System.out.printf("largeClassSize has the value: %d\n", largeClassSize);

        // Next, change the value in numberOfStudents
        numberOfStudents = 32;
        System.out.println();
        
        /*
            Finally, print the value of the 2 variables to show that changing 
            numberOfStudents did not affect largeClassSize

            NOTE: numberOfStudents will have the new value, 32. But largeClassSize
                  will retain its value
        */
        System.out.printf("numberOfStudents was changed to: %d\n", numberOfStudents);
        System.out.printf("largeClassSize still has the same value from earlier: %d\n", largeClassSize);

        System.out.println();
    }
}
