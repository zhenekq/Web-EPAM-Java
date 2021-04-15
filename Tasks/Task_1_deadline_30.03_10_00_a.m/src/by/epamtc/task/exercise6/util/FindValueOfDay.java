package by.epamtc.task.exercise6.util;

/*
 * FindValueOfDay
 * Class with methods that help to know
 * current hour, minute, second
 * Zhenya Vozny :)
 */

public class FindValueOfDay {

    public static int currentHour(int seconds) {
        if(seconds < 0){
            //exception
        }
        final int SECONDS_IN_DAY = 3600;
        int hour = seconds / SECONDS_IN_DAY;
        return hour;
    }

    public static int currentMinute(int seconds) {
        if(seconds < 0){
            //exception
        }
        final int SECONDS_IN_DAY = 3600;
        final int MINUTES_IN_DAY = 60;
        return (seconds - currentHour(seconds) * SECONDS_IN_DAY) / MINUTES_IN_DAY;
    }

    public static int currentSeconds(int seconds) {
        if(seconds < 0){
            //exception
        }
        final int SECONDS_IN_DAY = 3600;
        final int MINUTES_IN_DAY = 60;
        return seconds - currentHour(seconds) * SECONDS_IN_DAY - currentMinute(seconds) * MINUTES_IN_DAY;
    }
}
