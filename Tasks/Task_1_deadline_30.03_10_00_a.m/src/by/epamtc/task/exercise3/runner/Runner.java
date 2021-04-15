package by.epamtc.task.exercise3.runner;

import by.epamtc.task.ReadNumber;
import by.epamtc.task.exercise3.util.SolveMathTasks;

/*
 * Runner
 * The circle is inscribed in the square of the given area.
 * Find the area of a square inscribed in this circle.
 * How many times is the area of the inscribed square less
 * than the area of the given one?
 * Zhenya Vozny :)
 */

public class Runner {
    public static void main(String[] args){

        System.out.println("Enter the square area: ");

        double squareArea = ReadNumber.readOurCurrentNumberDouble();
        double legOfBigSquare = SolveMathTasks.legOfBigSquare(squareArea);
        double legOfLittleSquare = SolveMathTasks.legOfLittleSquare(legOfBigSquare);
        double squareAreaOfLittleSquare = SolveMathTasks.findSquareArea(legOfLittleSquare);
        double differencesInSquareArea = squareArea/squareAreaOfLittleSquare;

        System.out.println("Square area of square in circle: " +
                           squareAreaOfLittleSquare);

        System.out.println("Square area of square in circle is less than square area of big square in " +
                            differencesInSquareArea + " times");
    }
}
