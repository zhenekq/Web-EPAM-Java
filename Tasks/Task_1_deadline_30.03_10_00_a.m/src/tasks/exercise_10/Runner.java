package tasks.exercise_10;

import tasks.ReadNumber;


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
        Solve.printResult(leftBorderOfFunction,
                          rightBorderOfFunction,
                          stepOfOurFunction
        );
    }
}
