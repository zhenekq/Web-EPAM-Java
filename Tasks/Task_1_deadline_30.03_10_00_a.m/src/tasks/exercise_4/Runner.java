package tasks.exercise_4;

import tasks.ReadNumber;

/*
 * Runner
 * Write a program that prints true if the specified statement is true,
 * and false - otherwise: among the given integers A, B, C, D there are
 * at least two even ones.
 * Zhenya Vozny :)
 */

public class Runner {
    public static void main(String[] args) {

        System.out.println("Enter the first number: ");
        int firstNumber = ReadNumber.readOurCurrentNumber();

        System.out.println("Enter the second number: ");
        int secondNumber = ReadNumber.readOurCurrentNumber();

        System.out.println("Enter the third number: ");
        int thirdNumber = ReadNumber.readOurCurrentNumber();

        System.out.println("Enter the fourth number: ");
        int fourthNumber = ReadNumber.readOurCurrentNumber();

        boolean isMoreThanTwo = CheckNumbers.isEvenNumberMoreThanTwo(CheckNumbers.isNumberEven(firstNumber),
                                                                     CheckNumbers.isNumberEven(secondNumber),
                                                                     CheckNumbers.isNumberEven(thirdNumber),
                                                                     CheckNumbers.isNumberEven(fourthNumber));
        if(isMoreThanTwo) {
            System.out.println("Amount of even numbers are equals or more than 2: " + true);
        }
        else {
            System.out.println("Amount of even numbers are equals or more than 2: " + false);
        }
    }
}
