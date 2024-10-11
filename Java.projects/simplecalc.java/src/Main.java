import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Create a scanner abject o read input from the user
        Scanner scanner = new Scanner(System.in);

        //prompt the user to enter the first number
        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();

        //Prompt the user to enter the operator
        System.out.println("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        //Prompt the user to enter the second number
        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Initialise a variable for storing the result
        double result = 0;

        //Perform the calculation based on the operator
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
            case '*':
                result = num1 * num2;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else  {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid operator. Please use +, -, *, or /.");
                return;
        }
        // Output the result
        System.out.println("The result is: " + result);
    }
}