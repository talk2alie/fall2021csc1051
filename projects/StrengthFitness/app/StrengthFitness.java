package app;

import training.Category;
import training.Exercise;
import training.ExerciseSet;
import training.Workout;

/**
 * Strength Fitness
 */
public class StrengthFitness {

    public static void main(String[] args) {
        System.out.println();

        printGreeting();
        printInstructions();
        
        var e = new Exercise("Bench Press", Category.Chest);
        ExerciseSet eset = new ExerciseSet(1, 15, 35, true);
        ExerciseSet eset1 = new ExerciseSet(2, 15, 40F, true);
        ExerciseSet eset2 = new ExerciseSet(3, 15, 45F, true);
        e.addSet(eset);
        e.addSet(eset1);
        e.addSet(eset2);

        var e1 = new Exercise("Incline Bench Press", Category.Chest);
        ExerciseSet e1set = new ExerciseSet(1, 15, 35, true);
        ExerciseSet e1set1 = new ExerciseSet(2, 15, 40F, true);
        ExerciseSet e1set2 = new ExerciseSet(3, 15, 45F, true);
        e1.addSet(e1set);
        e1.addSet(e1set1);
        e1.addSet(e1set2);
        
        var day1 = new Workout("Chest");
        day1.addExercise(e);
        day1.addExercise(e1);
        day1.print();

        System.out.println();
    }
    
    private static void printGreeting() {
        System.out.println("Welcome to StrengthFitness!");
        System.out.println("=============================");
        System.out.println();
    }

    private static void printInstructions() {
        System.out.println("Please enter a command and press Enter on your keyboard");
        System.out.println();
        System.out.println("Below are the commands for using the app: ");
        System.out.println("---------------------------------------------------");
        System.out.println("Command\t\t|Description");
        System.out.println("----------------|----------------------------------");
        System.out.println("ae\t\t|Add a new exercise");
        System.out.println("----------------|----------------------------------");
        System.out.println("aw\t\t|Add a new workout");
        System.out.println("----------------|----------------------------------");
        System.out.println("vd-mmddyyyy\t|View workout on the given date");
        System.out.println("----------------|----------------------------------");
        System.out.println("sw\t\t|Start workout for the current date");
        System.out.println("----------------|----------------------------------");
        System.out.println("ew\t\t|End workout for the current date");
        System.out.println("---------------------------------------------------");
        System.out.println();
    }
}