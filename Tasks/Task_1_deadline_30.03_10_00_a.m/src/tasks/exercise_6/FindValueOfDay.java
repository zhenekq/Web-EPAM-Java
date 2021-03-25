package tasks.exercise_6;

/*
 * FindValueOfDay
 * Class with methods that help to know
 * current hour, minute, second
 * Zhenya Vozny :)
 */

public class FindValueOfDay {

    public static int currentHour(int seconds) {
        return seconds / 3600;
    }

    public static int currentMinute(int seconds) {
        return (seconds - currentHour(seconds) * 3600) / 60;
    }

    public static int currentSeconds(int seconds) {
        return seconds - currentHour(seconds) * 3600 - currentMinute(seconds) * 60;
    }
}
