package by.epamtc.task.exercise_10;

import by.epamtc.task.ReadNumber;

/*
 * Runner
 * Write a program for calculating the values of the function F (x) on the segment [a, b] with step h.
 * Result represent in the form of a table, the first column of which is the values of the argument,
 *  the second is the corresponding function values. Function -> F(x) = tg(x)
 * Zhenya Vozny :)
 */

public class Runner {
    public static void main(String[] args){

        System.out.println("Enter range where count function... ");

        System.out.print("\nLeft border of range of function: ");
        double leftBorderOfFunction = ReadNumber.readOurCurrentNumberDouble();

        System.out.print("\nRight border of range of function: ");
        double rightBorderOfFunction = ReadNumber.readOurCurrentNumberDouble();

        System.out.println("Enter step of our function: ");
        double stepOfOurFunction = ReadNumber.readOurCurrentNumberDouble();

        System.out.println("Result: \n");
        System.out.println("Border value | Value of Function");
        System.out.println("--------------------------------");
        Solve.printResult(leftBorderOfFunction, rightBorderOfFunction, stepOfOurFunction);
    }
}
