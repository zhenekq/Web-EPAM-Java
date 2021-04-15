package by.epamtc.task.exercise9.util;

/*
 * Radius
 * Methods that calculate length
 * and square of circle
 * Zhenya Vozny :)
 */

public class Radius {

    public static double lengthOfCircle(double radius) {
        if(radius < 0){
            //exception
        }
        double length = 2 * Math.PI * radius;
        return length;
    }

    public static double squareAreaOfCircle(double radius) {
        if(radius < 0){
            //exception
        }
        double squareArea = Math.PI * radius * radius;
        return squareArea;
    }
}
