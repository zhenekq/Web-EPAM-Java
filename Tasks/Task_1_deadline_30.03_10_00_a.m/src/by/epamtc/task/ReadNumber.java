package by.epamtc.task;
/*
 *Вы читаете комменатарии? :)))
 * Я зря это коммитал что-ли? :(
 */

import java.util.Scanner;

/*
 * ReadNumber
 * Common class for scan numbers by keyboard
 * for double and integer values
 * Zhenya Vozny :)
 */

public class ReadNumber {
    @SuppressWarnings("resource")
    public static int readOurCurrentNumber(){
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.println("Please! Enter correct number...");
        }
        return scanner.nextInt();
    }
    @SuppressWarnings("resource")
    public static double readOurCurrentNumberDouble(){
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextDouble()) {
            scanner.nextLine();
            System.out.println("Please! Enter correct number...");
        }
        return scanner.nextDouble();
    }
}
