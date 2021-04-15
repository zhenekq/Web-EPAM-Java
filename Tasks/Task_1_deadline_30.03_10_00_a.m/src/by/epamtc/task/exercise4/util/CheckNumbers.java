package by.epamtc.task.exercise4.util;

/*
 * CheckNumbers
 * Class with methods that check is number even and
 * is even numbers more than two
 * Zhenya Vozny :)
 */

public class CheckNumbers {
    public static boolean isNumberEven(int number) {
        if (number < 0) {
            //exception
        }
        boolean isEven = number % 2 == 0;
        return isEven;
    }

    public static boolean isEvenNumberMoreThanTwo(boolean... number) {
        if (number == null) {
            //exception
        }
        int counter = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i]) {
                counter++;
            }
            if (counter == 2)
                break;
        }
        boolean isMoreThanTwo = counter >= 2;
        return isMoreThanTwo;
    }
}
