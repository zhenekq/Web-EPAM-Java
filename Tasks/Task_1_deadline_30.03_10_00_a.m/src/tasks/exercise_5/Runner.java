package tasks.exercise_5;

import tasks.ReadNumber;

public class Runner {
    public static void main(String[] args){

        System.out.println("Enter the number: ");
        int ourCurrentNumber = ReadNumber.readOurCurrentNumber();

        boolean isAbsolute = Check.areNumbersIdent(
                ourCurrentNumber, Logic.sumOfDividers(ourCurrentNumber)
        );
        System.out.println("Is out number absolute? : " +
                            isAbsolute
        );
    }
}
