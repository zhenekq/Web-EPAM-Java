package tasks;

import java.util.Scanner;

public class ReadNumber {
    @SuppressWarnings("resource")
    public static int readOurCurrentNumber(){
        Scanner scanner = new Scanner(System.in);
        int ourCurrentNumber = 0;
        while(!scanner.hasNextInt()){
            scanner.nextLine();
            System.out.println("Please! Enter integer number...");
        }
        ourCurrentNumber = scanner.nextInt();
        return ourCurrentNumber;
    }
}
