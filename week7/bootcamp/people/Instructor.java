package bootcamp.people;

public class Instructor {
    private Title title;
    private String firstName;
    private String middleName;
    private String lastName;
    private int staffId;

    public Instructor(Title title, int staffId, String firstName, String middleName, String lastName) {
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
        return String.format("%s%s%s%s",title, firstName, middleName == null || middleName.length() == 0 ? " " : " " + middleName + " ", lastName);
    }

    public String toTable() {
        return String.format("%d,%s,%s,%s,%s", staffId,title,firstName,(middleName == null || middleName.length() == 0 ? "" : middleName), lastName);
    }
}
