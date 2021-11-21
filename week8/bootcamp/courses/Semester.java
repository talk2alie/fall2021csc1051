package bootcamp.courses;

public class Semester {
    private String name;
    private int year;

    public Semester(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String toString() {
        return String.format("%s %d", name, year);
    }
}
