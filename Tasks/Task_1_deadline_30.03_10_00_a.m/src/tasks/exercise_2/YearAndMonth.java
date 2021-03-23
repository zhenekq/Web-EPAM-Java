package tasks.exercise_2;

public class YearAndMonth {
    public static int day(int year, int month){
        int amountOfDaysInMonth[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        if(Check.isLeapYear(year) && Check.isMonthExist(month)){
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
