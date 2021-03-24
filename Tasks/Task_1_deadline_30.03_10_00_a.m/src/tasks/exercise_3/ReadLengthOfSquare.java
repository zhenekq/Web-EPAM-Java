package tasks.exercise_3;

import java.util.Scanner;

public class ReadLengthOfSquare {
    @SuppressWarnings("resource")
    public static double readOurCurrentSquareArea(){
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextDouble()) {
            scanner.nextLine();
            System.out.println("Enter the correct number...");
        }
        return scanner.nextInt();
    }
}
