package tasks.exercise_3;

public class Runner {
    public static void main(String[] args){
        System.out.println("Enter the square area: ");
        double squareArea = ReadLengthOfSquare.readOurCurrentSquareArea();
        double legOfBigSquare = SolveMathTasks.legOfBigSquare(squareArea);
        double legOfLittleSquare = SolveMathTasks.legOfLittleSquare(legOfBigSquare);
        double squareAreaOfLittleSquare = SolveMathTasks.findSquareArea(legOfLittleSquare);
        System.out.println("Square area of square in circle: " + squareAreaOfLittleSquare);
        System.out.println("Square area of square in circle is less than square area of big square in " +
                squareArea/squareAreaOfLittleSquare+" times");
    }
}
