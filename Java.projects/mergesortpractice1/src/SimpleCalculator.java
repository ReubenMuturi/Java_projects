import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Simple Calculator!");
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Choose an operator: +, -, *, /: ");
        char operator = scanner.next().charAt(0);

        double result = 0;
        boolean validOperation = true; // Flag to check if the operation is valid

        if (operator == '+' ) {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Cannot divide by zero.");
                validOperation = false;
            }
        } else {
            System.out.println("Invalid operator! Please use +, -, *, or /.");
            validOperation = false; // Invalid operation
        }

        if (validOperation) {
            System.out.println("Result: " + result);
        }
    }
}