package by.epamtc.task.exercise8.runner;

import by.epamtc.task.ReadNumber;
import by.epamtc.task.exercise8.util.Check;
import by.epamtc.task.exercise8.util.Functions;


/*
 * Runner
 * Calculate the value of the function:
 * if value >= 3 -> -x^2 + 3 * x + 9
 * if value < 3 -> 1 / (x ^ 3 - 6)
 * Zhenya Vozny :)
 */

public class Runner {
    public static void main(String[] args) {

        System.out.println("Enter " + "'x' for equation: ");
        double equationValueX = ReadNumber.readOurCurrentNumberDouble();
        double resultOfFunction = 0;
        //is x >= 3+++
        if (!Check.isXMoreThanThree(equationValueX)) {
            resultOfFunction = Functions.xLowerThree(equationValueX);
            System.out.println("Result of function F(x) = " + resultOfFunction);
        }
        resultOfFunction = Functions.xEqualsOrMoreThanThree(equationValueX);
        System.out.println("Result of function F(x) = " + resultOfFunction);
    }
}

