package tasks.exercise_8;

import tasks.ReadNumber;

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
        //is x >= 3
        if(!Check.whatIsX(equationValueX)){
            resultOfFunction = Functions.xLowerThree(equationValueX);
            System.out.println("Result of function F(x) = " + resultOfFunction);
        }else{
            resultOfFunction = Functions.xEqualsOrMoreThanThree(equationValueX);
            System.out.println("Result of function F(x) = " + resultOfFunction);
        }
    }
}
