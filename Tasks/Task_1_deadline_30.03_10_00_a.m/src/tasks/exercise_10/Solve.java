package tasks.exercise_10;

public class Solve {
    public static void printResult(double leftBorder, double rightBorder, double step){
        if(step < 0)
            step *= -1;
        for(double valueOfFunction = Math.min(leftBorder, rightBorder);
            valueOfFunction <= Math.max(leftBorder,rightBorder);
            valueOfFunction += step){

            double tangentsValueOfFunction = Tangents.countValueOfTangents(valueOfFunction);
            System.out.println("   " +
                    HandsomeNumber.ceilNumberTwoDigits(valueOfFunction) +
                    "    |      " + HandsomeNumber.ceilNumberTwoDigits(tangentsValueOfFunction)
            );

        }
    }
}
