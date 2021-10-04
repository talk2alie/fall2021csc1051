package training;

import java.util.HashMap;

public class Exercise {
    private String name;
    private Category category;
    private HashMap<Integer, ExerciseSet> sets;

    public Exercise(String name, Category category) {
        this.name = name;
        this.category = category;
        sets = new HashMap<Integer,ExerciseSet>();
        sets.put(1, new ExerciseSet(1, 0, 0));
    }

    public void addSet(ExerciseSet set) {
        sets.put(set.position, set);
    }

    public void changeName(String newName) {
        name = newName;
    }

    public void changeSetReps(int setPosition, int newReps) {
        ExerciseSet set = sets.get(setPosition);
        set.changeReps(newReps);
    }

    public void print() {
        System.out.printf("Name: %s\tMuscle Group: %s\n", name, category.name());
        System.out.println("---------------------------------------------------");
        System.out.printf("%-10s%-10s%-10s%-10s\n", "Position", "Weight", "Reps", "Completed?");
        for (ExerciseSet set : sets.values()) {
            set.print();
        }
    }
}
