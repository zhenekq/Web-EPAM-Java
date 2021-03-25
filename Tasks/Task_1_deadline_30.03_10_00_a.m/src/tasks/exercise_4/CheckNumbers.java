package tasks.exercise_4;

/*
 * CheckNumbers
 * Class with methods that check is number even and
 * is even numbers more than two
 * Zhenya Vozny :)
 */

public class CheckNumbers {
    public static boolean isNumberEven(int number){
        return number % 2 == 0;
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
        return howMuchEvenNumbers >= 2;
    }
}
