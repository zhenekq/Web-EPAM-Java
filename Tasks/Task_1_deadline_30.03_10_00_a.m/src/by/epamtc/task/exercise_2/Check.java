package by.epamtc.task.exercise_2;

/*
 * Check
 * Check is year leap, is month and year exist
 * Zhenya Vozny :)
 *
 */

public class Check {

    public static boolean isLeapYear(int year) {
        boolean isLeap = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0 ) && year != 0;
        return isLeap;
    }

    public static boolean isMonthExist(int month) {
        boolean isLeap = month >= 1 && month <= 12;
        return isLeap;
    }

    public static boolean isYearExist(int year) {
        boolean isExists = year >= 0;
        return isExists;
    }

}
