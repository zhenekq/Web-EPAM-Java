package by.epamtc.task.exercise_2;

import by.epamtc.task.ReadNumber;

/*
 * Runner
 * Create a program that, for a given year
 * and month number, determines the number of
 * days in this month and all leap years were
 * correctly determined.
 * Zhenya Vozny :)
 */


public class Runner {
    public static void main(String[] args) {

        int year,month;

        System.out.println("Enter the year: ");
        year = ReadNumber.readOurCurrentNumber();
        //Is year input correct?
        while(!Check.isYearExist(year)) {
            System.out.println("Please! Enter the correct year");
            year = ReadNumber.readOurCurrentNumber();
        }

        System.out.println("Enter the month: ");
        month = ReadNumber.readOurCurrentNumber();
        //Is month input correct?
        while(!Check.isMonthExist(month)) {
            System.out.println("Please! Enter the correct month");
            month = ReadNumber.readOurCurrentNumber();
        }

        int amountOfDaysInThisMonth = YearAndMonth.day(year,month);
        System.out.print("Amount of days in this month is: " +
                         amountOfDaysInThisMonth + "\n");
    }
}
