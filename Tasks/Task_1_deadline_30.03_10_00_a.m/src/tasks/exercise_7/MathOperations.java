package tasks.exercise_7;

public class MathOperations {
    public static double distanceBetweenPoints(double coordinateX, double coordinateY){
        double distance = Math.sqrt(
           (coordinateX * coordinateX) + (coordinateY * coordinateY)
        );
        return distance;
    }
}
