package tasks.exercise_2;

public class Check {
    public static boolean isLeapYear(int year){
        return year % 4 == 0 && year != 0;
    }
    public static boolean isMonthExist(int month){
        return month >= 1 && month <= 12;
    }
    public static boolean isYearExist(int year){
        return year >= 0;
    }

}
