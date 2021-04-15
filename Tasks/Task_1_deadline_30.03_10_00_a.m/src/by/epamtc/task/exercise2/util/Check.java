package by.epamtc.task.exercise2.util;

/*
 * Check
 * Check is year leap, is month and year exist
 * Zhenya Vozny :)
 *
 */

public class Check {

    public static boolean isLeapYear(int year) {
        if(year < 0){
            //exception
        }
        boolean isLeap = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0 ) && year != 0;
        return isLeap;
    }

    public static boolean isMonthExist(int month) {
        if(month < 1 || month > 12){
            //exception
        }
        boolean isExists = month >= 1 && month <= 12;
        return isExists;
    }

    public static boolean isYearExist(int year) {
        if(year < 0 ){
            //exception
        }
        boolean isExists = year >= 0;
        return isExists;
    }

}
