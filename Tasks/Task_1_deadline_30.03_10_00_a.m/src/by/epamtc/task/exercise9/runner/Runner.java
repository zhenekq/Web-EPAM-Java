package by.epamtc.task.exercise9.runner;

import by.epamtc.task.ReadNumber;
import by.epamtc.task.exercise9.util.Radius;

/*
 * Runner
 * Calculate the circumference and area of
 * a circle with the same given radius R.
 * Zhenya Vozny :)
 */

public class Runner {
    public static void main(String[] args){

        System.out.println("Enter radius of circle: ");
        double radiusOfCircle = ReadNumber.readOurCurrentNumberDouble();
        while(radiusOfCircle < 0){
            System.out.println("Please! Enter the correct radius");
            radiusOfCircle = ReadNumber.readOurCurrentNumber();
        }

        double lengthOfCircle = Radius.lengthOfCircle(radiusOfCircle);
        System.out.println("Length of circle is : " + lengthOfCircle);

        double squareAreaOfCircle = Radius.squareAreaOfCircle(radiusOfCircle);
        System.out.println("Square are of circle is : " + squareAreaOfCircle);
    }
}
