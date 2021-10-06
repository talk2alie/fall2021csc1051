package bootcamp.people;

public class Instructor {
    private String firstName;
    private String middleName;
    private String lastName;
    private int staffId;

    public Instructor(int staffId, String firstName, String middleName, String lastName) {
        this.staffId = staffId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public int getStaffId() {
        return staffId;
    }

    public String toString() {
        return String.format("%s%s%s", firstName, middleName == null || middleName.length() == 0 ? " " : " " + middleName + " ", lastName);
    }
}
