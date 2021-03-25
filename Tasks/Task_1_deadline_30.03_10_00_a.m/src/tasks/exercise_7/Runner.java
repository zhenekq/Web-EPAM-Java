package tasks.exercise_7;

import tasks.ReadNumber;

public class Runner {
    public static void main(String[] args){
        System.out.println("Enter the coordinates of the first point... ");
        System.out.print("Enter x1: ");
        double coordinateOfFirstPointX = ReadNumber.readOurCurrentNumberDouble();
        System.out.print("Enter y1: ");
        double coordinateOfFirstPointY = ReadNumber.readOurCurrentNumberDouble();

        System.out.println("Enter the coordinates of the second point... ");
        System.out.print("Enter x2: ");
        double coordinateOfSecondPointX = ReadNumber.readOurCurrentNumberDouble();
        System.out.print("Enter y2: ");
        double coordinateOfSecondPointY = ReadNumber.readOurCurrentNumberDouble();

        double lengthOfFirstPoint = MathOperations.distanceBetweenPoints(
                coordinateOfFirstPointX, coordinateOfFirstPointY
        );
        double lengthOfSecondPoint = MathOperations.distanceBetweenPoints(
                coordinateOfSecondPointX, coordinateOfSecondPointY
        );
        if(lengthOfFirstPoint > lengthOfSecondPoint)
            System.out.println("Second point is nearer than first point!");
        else
            System.out.println("First point is nearer than second point");
    }
}
