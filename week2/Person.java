public class Person {
    private String firstName;
    private String lastName;
    private byte age;

    public Person(String firstName, String lastName, byte age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void changeFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void changeLastName(String lastName) {
        this.lastName = lastName;
    }

    public void changeAge(byte age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public byte getAge() {
        return age;
    }

    public String getFullName() {
        return String.format("%s %s", firstName, lastName);
    }
}
