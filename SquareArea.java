import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: side length of the square
        System.out.print("Enter the side length of the square: ");
        double side = scanner.nextDouble();

        // Calculate area
        double area = side * side;

        // Output result
        System.out.println("The area of the square is: " + area);

        scanner.close();
    }
}
