package tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadNumber {
    @SuppressWarnings("resource")
    public static int readOurCurrentNumber(){
        Scanner scanner = new Scanner(System.in);
        int ourCurrentNumber = 0;
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.println("Please! Enter correct number...");
        }
        return scanner.nextInt();
    }
}
