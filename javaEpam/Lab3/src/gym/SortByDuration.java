package gym;

import java.util.*;

public class SortByDuration implements Comparator<Exercise> {
    public int compare(Exercise a, Exercise b) {
        /* descending order */
        return b.getDuration() - a.getDuration();
    }
}
