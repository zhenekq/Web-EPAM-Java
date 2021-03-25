package tasks.exercise_8;

import org.w3c.dom.ls.LSOutput;
import tasks.ReadNumber;

public class Runner {
    public static void main(String[] args){

        System.out.println("Enter " + "'x' for equation: ");
        double equationValueX = ReadNumber.readOurCurrentNumberDouble();
        double resultOfFunction = 0;

        if(!Check.whatIsX(equationValueX)){
            resultOfFunction = Functions.xLowerThree(equationValueX);
            System.out.println("Result of function F(x) = " +
                    resultOfFunction
            );
        }else{
            resultOfFunction = Functions.xEqualsOrMoreThanThree(equationValueX);
            System.out.println("Result of function F(x) = " +
                    resultOfFunction
            );
        }
    }
}
