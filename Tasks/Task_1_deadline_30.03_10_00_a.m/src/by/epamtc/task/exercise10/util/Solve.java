package by.epamtc.task.exercise10.util;

/*
 * Solve
 * Solve our values of functions in range and print
 * Zhenya Vozny :)
 */

import java.util.HashMap;
import java.util.Map;

public class Solve {

    public static Map<Double, Double> collectResult(double leftBorder, double rightBorder, double step){
        if(step < 0) {
            step *= -1;
        }
        Map <Double, Double> map = new HashMap<>();
        for(double valueOfFunction = Math.min(leftBorder, rightBorder);
            valueOfFunction <= Math.max(leftBorder,rightBorder);
            valueOfFunction += step) {

            double tangentsValueOfFunction = Tangents.countValueOfTangents(valueOfFunction);
            map.put(valueOfFunction, tangentsValueOfFunction);
        }
        return map;
    }
}
