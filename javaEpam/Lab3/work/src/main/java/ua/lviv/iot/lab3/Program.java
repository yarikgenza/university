package ua.lviv.iot.lab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    private String name;
    private Type type;
    private List<Exercise> targetExercises = new ArrayList();

    public enum Type { POWER, SLIMMING, COMPLEX, };

    public Program(Type type, String name) {
        this.type = type;
        this.name = name;
        initExercises(type);
    }

    private void initExercises(Type type) {
        switch (type) {
            case POWER: {
                targetExercises.add(new Exercise(Exercise.Name.RUNNING, 20));
                break;
            }
            case SLIMMING: {
                targetExercises.add(new Exercise(Exercise.Name.BARBELL_WORK, 20));
                break;
            }
            case COMPLEX: {
                targetExercises.add(new Exercise(Exercise.Name.BARBELL_WORK, 5));
                targetExercises.add(new Exercise(Exercise.Name.RUNNING, 15));
                break;
            }
        }
    }

    private void sortExercises() {
        Collections.sort(targetExercises, new SortByDuration());
    }

    public void printDetails() {
        String info = "Program " + name + ": \n \n";

        sortExercises();

        for (int i = 0; i < targetExercises.size(); i++) {
             Exercise exerciseToParse = targetExercises.get(i);
             info += exerciseToParse.getDescription(i);
        }

        System.out.println(info);
    }
}
