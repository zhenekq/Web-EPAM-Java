package by.epamtc.task.exercise3.util;

/*
 * SolveMathTasks
 * Methods that find leg of big and little
 * square and square area of little square
 * Zhenya Vozny :)
 */

public class SolveMathTasks {
    public static double legOfBigSquare(double squareArea) {
        if(squareArea < 0){
            //exception
        }
        double square = Math.sqrt(squareArea);
        return square;
    }
    public static double legOfLittleSquare(double leg){
        if(leg < 0){
            //exception
        }
        final int valueToGetSqrtOfTwo = 2;
        double littleLeg = leg / Math.sqrt(valueToGetSqrtOfTwo);
        return littleLeg;
    }
    public static double findSquareArea(double leg){
        if(leg < 0){
            //exception
        }
        double squareArea = leg * leg;
        return squareArea;
    }
}
