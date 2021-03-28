package by.epamtc.task.exercise_4;

/*
 * CheckNumbers
 * Class with methods that check is number even and
 * is even numbers more than two
 * Zhenya Vozny :)
 */

public class CheckNumbers {
    public static boolean isNumberEven(int number){
        boolean isEven = number % 2 == 0;
        return isEven;
    }
    public static boolean isEvenNumberMoreThanTwo(boolean firstNumber, boolean secondNumber,
                                                   boolean thirdNumber, boolean fourthNumber){
        int howMuchEvenNumbers = 0;
        if (firstNumber)
            howMuchEvenNumbers++;
        if(secondNumber)
            howMuchEvenNumbers++;
        if(thirdNumber)
            howMuchEvenNumbers++;
        if(fourthNumber)
            howMuchEvenNumbers++;
        boolean isMoreThanTwo = howMuchEvenNumbers >= 2;
        return isMoreThanTwo;
    }
}
