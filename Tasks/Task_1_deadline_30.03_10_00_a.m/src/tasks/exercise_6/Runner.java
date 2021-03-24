package tasks.exercise_6;

import org.w3c.dom.ls.LSOutput;
import tasks.ReadNumber;

public class Runner {
    public static void main(String[] args){
        System.out.println("Enter amount seconds have passed in day: ");
        int secondsHavePassedInDay = ReadNumber.readOurCurrentNumber();
        while(secondsHavePassedInDay < 0) {
            System.out.println("Enter the correct number...");
            secondsHavePassedInDay = ReadNumber.readOurCurrentNumber();
        }

        System.out.println("Current time is: \n" +
                FindValueOfDay.currentHour(secondsHavePassedInDay) + "h : " +
                FindValueOfDay.currentMinute(secondsHavePassedInDay) + "min : " +
                FindValueOfDay.currentSeconds(secondsHavePassedInDay) + "sec");
    }
}
