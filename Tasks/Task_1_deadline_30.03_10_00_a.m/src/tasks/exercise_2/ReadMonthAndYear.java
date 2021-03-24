package tasks.exercise_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadMonthAndYear {
    @SuppressWarnings("resource")
    public static int readOurCurrentYear(){
        Scanner scanner = new Scanner(System.in);
        int ourCurrentValue = 0;
        while (!scanner.hasNextInt() || !Check.isYearExist(scanner.nextInt())) {
            scanner.nextLine();
            System.out.println("Enter the correct year...");
        }
        System.out.println("Correct year! \n" + "Please enter your year again: ");
        return scanner.nextInt();
    }
    @SuppressWarnings("resource")
    public static int readOurCurrentMonth(){
        Scanner scanner = new Scanner(System.in);
        int ourCurrentValue = 0;
        while (!scanner.hasNextInt() || !Check.isMonthExist(scanner.nextInt())) {
            scanner.nextLine();
            System.out.println("Enter the correct month...");
        }
        System.out.println("Correct month! \n" + "Please enter your month again: ");
        return scanner.nextInt();
    }
}
