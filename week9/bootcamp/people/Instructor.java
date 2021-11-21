package bootcamp.people;

public class Instructor extends Person implements FullName {
    private Title title;
    private int staffId;

    public Instructor(int staffId, Title title, String firstName, String middleName, String lastName) {
        this.title = title;
        this.staffId = staffId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public int getStaffId() {
        return staffId;
    }

    public String toString() {
        return String.format("%s %s%s%s",title == Title.Professor ? title : title + ".", firstName, middleName == null || middleName.length() == 0 ? " " : " " + middleName + " ", lastName);
    }

    public String getFullName() {
        return String.format("%s %s%s%s",title == Title.Professor ? title : title + ".", firstName, middleName == null || middleName.length() == 0 ? " " : " " + middleName + " ", lastName);
    }
}
