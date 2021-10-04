package people;

public class Person {
    String firstName;
    String middleName;
    String lastName;
    int birthYear;
    float height;
    String gender;
    private float energyLevel;

    public Person(String fName, String middleName, String lastName, int birthYear, float height, String gender,
    float energyLevel) {
        this.firstName = fName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.height = height;
        this.gender = gender;
        this.energyLevel = energyLevel;

        System.out.println(fName);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setEnergyLevel(int energyLevel) {
        if(energyLevel > 100) {
            this.energyLevel = 100;
        }
        else {
            this.energyLevel = energyLevel;
        }
    }

    public float getEnergyLevel() {
        return energyLevel;
    }
}
