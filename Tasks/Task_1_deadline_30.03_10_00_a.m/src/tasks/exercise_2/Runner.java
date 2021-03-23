package tasks.exercise_2;

import tasks.exercise_1.ReadNumber;
import tasks.exercise_2.YearAndMonth;

public class Runner {
    public static void main(String[] args){
        int year,month;
        System.out.println("Enter the year: ");
        year = ReadMonthAndYear.readOurCurrentYear();
        System.out.println("Enter the month: ");
        month = ReadMonthAndYear.readOurCurrentMonth();
        System.out.print("Amount of days in this month is: ");
        System.out.println(YearAndMonth.day(year,month));
    }
}
