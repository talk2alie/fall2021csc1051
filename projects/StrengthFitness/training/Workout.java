package training;

import java.util.HashMap;

public class Workout {
    private String name;
    private HashMap<Integer, Exercise> exercises;

    public Workout(String name) {
        this.name = name;
        exercises = new HashMap<>();
    }

    public void addExercise(Exercise exercise) {
        exercises.put(exercises.size() + 1, exercise);
    }

    public void print() {
        System.out.println("===================================================");
        System.out.printf("%s Workout\n", name);
        for (Exercise exercise : exercises.values()) {
            exercise.print();
        }
        System.out.println("===================================================");
    }    
}
