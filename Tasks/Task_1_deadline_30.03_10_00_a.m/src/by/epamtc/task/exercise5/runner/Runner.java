package by.epamtc.task.exercise5.runner;

import by.epamtc.task.ReadNumber;
import by.epamtc.task.exercise5.util.Check;
import by.epamtc.task.exercise5.util.Logic;

/*
 * Runner
 * Write a program that prints true if the specified statement is true,
 * and false - otherwise: is the integer perfect (the sum of the divisors is equal to number).
 * Zhenya Vozny :)
 */

public class Runner {
    public static void main(String[] args) {

        System.out.println("Enter the number: ");
        int ourCurrentNumber = ReadNumber.readOurCurrentNumber();

        boolean isAbsolute = Check.isNumbersIdent(ourCurrentNumber,
                                                   Logic.sumOfDividers(ourCurrentNumber));
        System.out.println("Is our number absolute? : " + isAbsolute);
    }
}
