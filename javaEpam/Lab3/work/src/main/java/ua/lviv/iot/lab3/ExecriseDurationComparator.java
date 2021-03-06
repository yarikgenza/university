package ua.lviv.iot.lab3;

import java.util.Comparator;

public class ExecriseDurationComparator implements Comparator<Exercise> {
    public int compare(Exercise a, Exercise b) {
        /* descending order */
        return b.getDuration() - a.getDuration();
    }
}
