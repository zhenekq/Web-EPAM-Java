package by.epamtc.task.exercise_8;

/*
 * Functions
 * Calculate the value for functions
 * Zhenya Vozny :)
 */

public class Functions {

    public static double xLowerThree(double x) {
        double functionResult = 1  / (Math.pow(x, 3) - 6);
        return functionResult;
    }

    public static double xEqualsOrMoreThanThree(double x) {
        double functionResult = -1 * x * x + 3 * x + 9;
        return functionResult;
    }
}
