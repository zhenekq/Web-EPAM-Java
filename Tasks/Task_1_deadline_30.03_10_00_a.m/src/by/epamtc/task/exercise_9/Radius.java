package by.epamtc.task.exercise_9;

/*
 * Radius
 * Methods that calculate length
 * and square of circle
 * Zhenya Vozny :)
 */

public class Radius {

    public static double lengthOfCircle(double radius) {
        double length = 2 * Math.PI * radius;
        return length;
    }

    public static double squareAreaOfCircle(double radius) {
        double squareArea = Math.PI * radius * radius;
        return squareArea;
    }
}
