import java.util.Scanner;

public class LinearEquationCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input: Slope (m), Intercept (b), and Value for x
        System.out.println("Enter the value for slope (m): ");
        double m = scanner.nextDouble();

        System.out.println("Enter the value for intercept (b): ");
        double b = scanner.nextDouble();

        System.out.println("Enter the value for x: ");
        double x = scanner.nextDouble();

        // Calculate y = mx + b
        double y = m * x + b;

        // Output the result
        System.out.println("The value of y = " + y);

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
