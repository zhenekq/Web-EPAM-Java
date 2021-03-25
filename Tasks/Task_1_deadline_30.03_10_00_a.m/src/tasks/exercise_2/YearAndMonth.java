package tasks.exercise_2;

/*
 * YearAndMonth
 * Class with method that return
 * amount of days in month by number
 * Zhenya Vozny :)
 */

public class YearAndMonth {
    public static int day(int year, int month) {
        //Zero Element is January(array of days in month)
        int[] amountOfDaysInMonth = {31, 28, 31,
                                     30, 31, 30,
                                     31, 31, 30,
                                     31, 30,31 };

        if(Check.isLeapYear(year) && Check.isMonthExist(month)){
            //If month February and year leap -> February + 1 day = 29 days
            if(month == 2)
                return amountOfDaysInMonth[month - 1] + 1;
            else{
                return amountOfDaysInMonth[month - 1];
            }
        }
        else if(Check.isYearExist(year) && Check.isMonthExist(month))
            return amountOfDaysInMonth[month - 1];
        return 0;
    }
}
