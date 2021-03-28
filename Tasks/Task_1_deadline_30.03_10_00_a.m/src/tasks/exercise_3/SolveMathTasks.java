package tasks.exercise_3;

/*
 * SolveMathTasks
 * Methods that find leg of big and little
 * square and square area of little square
 * Zhenya Vozny :)
 */

public class SolveMathTasks {
    public static double legOfBigSquare(double squareArea) {
        double square = Math.sqrt(squareArea);
        return square;
    }
    public static double legOfLittleSquare(double leg){
        final int valueToGetSqrtOfTwo = 2;
        double littleLeg = leg / Math.sqrt(valueToGetSqrtOfTwo);
        return littleLeg;
    }
    public static double findSquareArea(double leg){
        double squareArea = leg * leg;
        return squareArea;
    }
}
