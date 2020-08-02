package zadanie16;

import java.time.Duration;

public enum Runner {
    BEGINNER(240, Integer.MAX_VALUE),
    INTERMEDIATE(180, 240),
    ADVANCED(138, 180),
    PROFESSIONAL(Integer.MIN_VALUE, 137);

    private final int min;
    private final int max;

    Runner(int minimum_Time_In_min, int maximum_Time_In_min) {
        this.min = minimum_Time_In_min;
        this.max = maximum_Time_In_min;
    }

//    static Runner getFitnessLevel(int time) {
//        if (time >= BEGINNER.min) {
//            return BEGINNER;
//        } else if (time >= INTERMEDIATE.min) {
//            return INTERMEDIATE;
//        } else return ADVANCED;
//    }

    static Runner getFitnessLevel(int runningTime) {
        for (Runner value : Runner.values()) {
            if (runningTime <= value.max && runningTime >= value.min) {
                return value;
            }
        }
        return BEGINNER;
    }

    static Runner getFitnessLevel(Duration runningTime) {
        for (Runner value : Runner.values()) {
            if (runningTime.toMillis() <= value.max && runningTime.toMillis() >= value.min) {
                return value;
            }
        }
        return BEGINNER;
    }


}
