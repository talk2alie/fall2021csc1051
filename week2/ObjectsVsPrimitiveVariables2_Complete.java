public class ObjectsVsPrimitiveVariables2_Complete {
    public static void main(String[] args) {
        System.out.println();

        /*
            An object is a variable created from a class. It is a reference to an object,
            that belongs to that class, in memory. While primitive variables hold their 
            actual value, objects (or object variables) do not hold their actual value. 
            They only hold a reference to the actual value in memory.

            Think of an object like a credit card. The card has a number that is a reference 
            to your bank account. The card itself does not have your money on it. It only 
            has a number that can be used to find your money in a bank. When you use your 
            card, its number is used to find your money and the value you used is deducted 
            from it.

            To create an object variable, you need the class from which to create the object.
            E.g. Create two objects from the Person class
        */
        Person person1, person2;

        /*
            Like primitive variables, once you have an object, you can initialize it with a value.
            Unlike primitive variables; however, initializing an object involves 3 things:

            1. the new keyword
               the new keyword creates the object in memory and returns the location of the newly 
               created object back to the class' constructor
            2. the object class' constructor
               A constructor is a special method of a class that has the same name as the class.
               It uses the reference, of the newly created object, it receives from the new 
               keyword to initialize all the fields, in that object, with their default value 
               if it does not accept arguments. If it accepts arguments, it will initialize the 
               fields in the object with the provided corresponding values passed as arguments
            3. (Optional) the arguments to the constructor if the constructor requires them. Every 
               class has a constructor, but not all constructors require argument or have parameters.
               A constructor that does not have parameters or require arguments is called a default 
               constructor
        */
        // Initialize 1 Person object and copy its reference into the other
        person1 = new Person("Merna", "Alahmadi", 32);
        person2 = person1;

        // Print the full name of each object to see they have the same names
        System.out.printf("person1's full name is set to: %s\n", person1.getFullName());
        System.out.printf("person2's full name is set to: %s\n", person2.getFullName());

        // // Next, change person2's first name
        person2.changeFirstName("Deaisha");

        // /*
        //     Finally, print the full name of each object to see that because person1's reference
        //     was copied to the person2 object, the two objects are now connected bceause their 
        //     variables have the same reference to the same object in memory. So any change you 
        //     make to one of them will affect the other
        // */
        System.out.printf("person1's full name is now set to person2's: %s\n", person1.getFullName());
        System.out.printf("person2's full name is now set to: %s\n", person2.getFullName());

        System.out.println();

        // /*
        //     If this confuses you, go back to the credit card analogy. Imagine you and your parent 
        //     have 2 credit cards with the same credit card number. When you use your card, your dad's
        //     credit card balance increases. When your dad uses the card, the smae credit card balance 
        //     increases. This is because the two credit cards are copies of another. The data they hold
        //     is a reference to the same credit card account.

        //     When two objects have the same reference to the same object in memory, the two objects are 
        //     said to be "aliases" of one another. If you do not want to create aliases, simply use the 
        //     class' constructor to initialize each object.

        //     When you use the class' constructor to create an object, it is said that you "instantiate" 
        //     the object. So, "instantiate an object" means create a new object with the class' constructor

        //     E.g.
        // */
        person1 = new Person("Adrian", "Rodriguez", 36);
        person2 = new Person("Merna", "Alahmadi", 32);

        // // Print the full name of each object to see they have different names
        // System.out.printf("person1's full name is set to: %s\n", person1.getFullName());
        // System.out.printf("person2's full name is set to: %s\n", person2.getFullName());

        // // Now change any of the objects
        // person2.changeLastName("Al-Ghamdi");

        // // Now, print the full name of each object to see they still have different names
        // System.out.printf("person1's full name is still set to: %s\n", person1.getFullName());
        // System.out.printf("person2's full name is now changed without affecting person1: %s\n", person2.getFullName());

        System.out.println();
    }
}
