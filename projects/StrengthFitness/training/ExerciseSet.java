package training;

public class ExerciseSet {
    int position;
    private float weightInPounds;
    private int reps;
    private boolean isDone;

    public ExerciseSet(int position, int reps, float weightInPounds, boolean isDone) {
        this.position = position;
        this.reps = reps;
        this.weightInPounds = weightInPounds;
        this.isDone = isDone;
    }

    public ExerciseSet(int position, int reps, float weightInPounds) {
        this.position = position;
        this.reps = reps;
        this.weightInPounds = weightInPounds;
        this.isDone = false;
    }

    public void changePosition(int newPosition) {
        position = newPosition;
    }

    public void increaseReps(int count) {
        reps += count;
    }

    public void decreaseReps(int count) {
        reps -= count;
    }

    public void changeReps(int reps) {
        this.reps = reps;
    }

    public void changeWeight(float weightInPounds) {
        this.weightInPounds = weightInPounds;
    }

    public void complete() {
        isDone = true;
    }

    public void print() {
        System.out.printf("%-10s%-10s%-10s%-10s\n", position + "", weightInPounds + "lbs", reps + "", isDone ? "Yes" : "No");
    }
}
