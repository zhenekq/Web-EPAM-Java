package by.epamtc.task.exercise_7;

/*
 * MathOperation
 * Find distance between zero and point
 * Zhenya Vozny :)
 */

public class MathOperations {

    public static double distanceBetweenPoints(double coordinateX, double coordinateY) {
        double distance = Math.sqrt((coordinateX * coordinateX) +
                                    (coordinateY * coordinateY));
        return distance;
    }
}
