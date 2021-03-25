package tasks.exercise_1;

/*
 * Logical Functions
 * Find last digits of numbers
 * Zhenya Vozny :)
 */

public class LogicalFunctions {

    public static int lastDigitOfOurCurrentNumber(int ourCurrentNumber) {
        return ourCurrentNumber % 10;
    }

    public static int lastDigitOfOurCurrentNumberInSquare(int lastDigit) {
        return lastDigit * lastDigit;
    }
}
