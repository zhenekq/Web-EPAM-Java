package by.epamtc.task.exercise5.util;

/*
 * Check
 * Class with methods that return:
 * 1)Are numbers equals
 * 2)Are numbers divisible
 * Zhenya Vozny :)
 */

public class Check {

    public static boolean isModZero(int number, int divider){
        boolean isRemainderZero = number % divider == 0;
        return isRemainderZero;
    }
    public static boolean isNumbersIdent(int firstNumber,int secondNumber){
        boolean areTwoIdentify = firstNumber == secondNumber;
        return areTwoIdentify;
    }
}
