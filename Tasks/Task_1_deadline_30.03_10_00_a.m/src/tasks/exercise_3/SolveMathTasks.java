package tasks.exercise_3;

public class SolveMathTasks {
    public static double legOfBigSquare(double squareArea) {
        return Math.sqrt(squareArea);
    }
    public static double legOfLittleSquare(double leg){
        return leg / Math.sqrt(2);
    }
    public static double findSquareArea(double leg){
        return leg * leg;
    }
}
