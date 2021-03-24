package tasks.exercise_4;

import tasks.ReadNumber;

public class Runner {
    public static void main(String[] args){
        System.out.println("Enter the first number: ");
        int firstNumber = ReadNumber.readOurCurrentNumber();
        System.out.println("Enter the second number: ");
        int secondNumber = ReadNumber.readOurCurrentNumber();
        System.out.println("Enter the third number: ");
        int thirdNumber = ReadNumber.readOurCurrentNumber();
        System.out.println("Enter the fourth number: ");
        int fourthNumber = ReadNumber.readOurCurrentNumber();
        boolean isMoreThanTwo = CheckNumbers.isEvenNumberMoreThanTwo(CheckNumbers.isNumberEven(firstNumber),
                CheckNumbers.isNumberEven(secondNumber), CheckNumbers.isNumberEven(thirdNumber),
                CheckNumbers.isNumberEven(fourthNumber));
        if(isMoreThanTwo)
            System.out.println("Even number is equals or more than 2: " + true);
        else
            System.out.println("Even number is equals or more than 2: " + false);
    }
}
