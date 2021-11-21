package bootcamp.people;

public class Person {
    String firstName;
    String middleName;
    String lastName;

    public String toString() {
        return String.format("%s%s%s", firstName, middleName == null || middleName.length() == 0 ? " " : " " + middleName + " ", lastName);
    }
}