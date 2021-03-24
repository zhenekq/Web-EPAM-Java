package tasks.exercise_4;

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
