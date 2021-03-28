package by.epamtc.task.exercise_1;

import by.epamtc.task.ReadNumber;

/*
 * Runner
 * Start application
 * Write a program that allows you to determine
 * the last digit of a number by the last digit
 * of a number square.
 * Zhenya Vozny :)
 */

public class Runner {
    public static void main(String[] args) {

        System.out.println("Enter our current number: ");
        int ourCurrentNumber = ReadNumber.readOurCurrentNumber();

        int lastDigitOfOurCurrentNumber = LogicalFunctions.lastDigitOfOurCurrentNumber(ourCurrentNumber);
        int squareOfLastDigit = LogicalFunctions.lastDigitOfOurCurrentNumberInSquare(lastDigitOfOurCurrentNumber);
        int lastDigitOfSquare = LogicalFunctions.lastDigitOfOurCurrentNumber(squareOfLastDigit);

        System.out.println("Last digit of last digit in square of number is: " + lastDigitOfSquare);
    }
}
