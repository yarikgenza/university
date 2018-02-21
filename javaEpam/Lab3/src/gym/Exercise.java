/*
 *
 * Lab3, created by Yarik Genza.
 *
 * Don't try to steal this code. Just remember: big Zenoviy and me are watching you!
 *
 * */


package gym;

public class Exercise {
    private Name name;
    private int duration;
    private Tool exerciseTool;

    public enum Name { RUNNING, BARBELL_WORK };

    public Exercise(Name exerciseName, int duration) {
        this.name = exerciseName;
        this.duration = duration;
        initExerciseTool(exerciseName);
    }

    public int getDuration() {
        return duration;
    }

    private void initExerciseTool(Name name) {
        switch (name) {
            case RUNNING: {
                exerciseTool = new Tool("Running road");
                break;
            }
            case BARBELL_WORK: {
                exerciseTool = new Tool("Barbell");
                break;
            }
        }
    }

    public String getDescription(int iterableKey) {
        return "Exercise " + (iterableKey + 1) + ":\n"
                + "Name: " + name + "\n"
                + "Tool: "
                + exerciseTool.getName() + "\n"
                + "Duration: " + duration + "\n\n";
    }
}
