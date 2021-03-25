package tasks.exercise_2;

import tasks.ReadNumber;

public class Runner {
    public static void main(String[] args){

        int year,month;

        System.out.println("Enter the year: ");
        year = ReadNumber.readOurCurrentNumber();
        while(!Check.isYearExist(year)){
            System.out.println("Please! Enter the correct year");
            year = ReadNumber.readOurCurrentNumber();
        }

        System.out.println("Enter the month: ");
        month = ReadNumber.readOurCurrentNumber();
        while(!Check.isMonthExist(month)){
            System.out.println("Please! Enter the correct month");
            month = ReadNumber.readOurCurrentNumber();
        }

        int amountOfDaysInThisMonth = YearAndMonth.day(year,month);
        System.out.print("Amount of days in this month is: " +
                            amountOfDaysInThisMonth + "\n"
        );
    }
}
