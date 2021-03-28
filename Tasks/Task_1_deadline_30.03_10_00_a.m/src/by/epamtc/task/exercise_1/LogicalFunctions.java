package by.epamtc.task.exercise_1;

/*
 * Logical Functions
 * Find last digits of numbers
 * Zhenya Vozny :)
 */

public class LogicalFunctions {

    public static int lastDigitOfOurCurrentNumber(int ourCurrentNumber) {
        int lastDigit = ourCurrentNumber % 10;
        return lastDigit;
    }

    public static int lastDigitOfOurCurrentNumberInSquare(int lastDigit) {
        int lastDigitInSquare = lastDigit * lastDigit;
        return lastDigitInSquare;
    }
}
