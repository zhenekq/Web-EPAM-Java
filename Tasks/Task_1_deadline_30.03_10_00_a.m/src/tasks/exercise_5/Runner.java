package tasks.exercise_5;

import tasks.ReadNumber;

public class Runner {
    public static void main(String[] args){
        System.out.println("Enter the number: ");
        int ourCurrentNumber = ReadNumber.readOurCurrentNumber();
        System.out.println("Our number is absolute? : " +
                Check.areNumbersIdent(ourCurrentNumber,Logic.sumOfDividers(ourCurrentNumber))
        );
    }
}
