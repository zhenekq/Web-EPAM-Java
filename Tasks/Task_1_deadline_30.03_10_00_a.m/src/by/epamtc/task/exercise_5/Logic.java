package by.epamtc.task.exercise_5;

/*
 * Logic
 * Class with method that return sum of Dividers
 * Zhenya Vozny :)
 */

public class Logic {

    public static int sumOfDividers(int number) {
        int sumOfDividers = 0;
        for(int i = 1;i < number;i++){
            if(Check.isModZero(number, i)) {
                sumOfDividers += i;
            }
        }
        return sumOfDividers;
    }
}
