package tasks.exercise_10;

/*
 * HandsomeNumber
 * Rounds our function value down to 4 decimal places
 * Zhenya Vozny :)
 */

public class HandsomeNumber {

    public static String ceilNumberTwoDigits(double number){
        String numberWithFourDigitsAfterComma = String.format("%.4f", number);
        return numberWithFourDigitsAfterComma;
    }
}
