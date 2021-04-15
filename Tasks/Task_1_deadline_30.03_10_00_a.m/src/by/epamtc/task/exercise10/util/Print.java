package by.epamtc.task.exercise10.util;

/*
 * HandsomeNumber
 * Rounds our function value down to 4 decimal places
 * Zhenya Vozny :)
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Print {
    public static void printTable(Map<Double, Double> map){
        if(map == null){
            //exception
        }
        List<Double> arrayList = new ArrayList(map.keySet());
        for(Double key: arrayList){
            System.out.println(key + " -----> " + map.get(key));
        }
    }
}
