import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Unit converter!");
        System.out.println("1. Length (meters to kilometers, miles, etc.)");
        System.out.println("2. Weight (grams to kilograms, pounds, etc.)");
        System.out.println("3. Temperature (Celsius to Fahrenheit, etc.)");
        System.out.print("Choose a converter type: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                lengthConversion(scanner);
                break;
            case 2:
                weightConversion(scanner);
                break;
            case 3:
                tempConversion(scanner);
                break;
            default:
                System.out.println("Invalid choice");
        }
        scanner.close();
    }
    public static void lengthConversion(Scanner scanner) {
        System.out.println("1. Meters to Kilometers");
        System.out.println("2. Meters to Miles");
        System.out.println("3. Kilometers to Miles");
        System.out.print("Choose the length of conversion: ");
        int choice = scanner.nextInt();

        System.out.print("Enter a value: ");
        double value = scanner.nextDouble();
        double result = 0;

        if (choice == 1) {
            result = value/1000;
            System.out.println(value + "meters = " + result + " Kilometers");
        } else if (choice == 2) {
            result = value/1609.34;
            System.out.println(value + "meters = " + result + "Miles");
        } else if (choice == 3) {
            result = value * 0.621371;
            System.out.println(value + " kilometers = " + result + " miles");
        } else {
            System.out.println("Invalid choice.");
        }
    }

    public static void weightConversion(Scanner scanner) {
        System.out.println("1. Grams to Kilograms");
        System.out.println("2. Kilograms to Pounds");
        System.out.println("3. Pounds to Kilograms");
        System.out.print("Choose the weight conversion: ");
        int choice = scanner.nextInt();

        System.out.print("Enter the value: ");
        double value = scanner.nextDouble();
        double result = 0;

        if (choice == 1) {
            result = value / 1000;
            System.out.println(value + " grams = " + result + " kilograms");
        } else if (choice == 2) {
            result = value * 2.20462;
            System.out.println(value + " kilograms = " + result + " pounds");
        } else if (choice == 3) {
            result = value / 2.20462;
            System.out.println(value + " pounds = " + result + " kilograms");
        } else {
            System.out.println("Invalid choice.");
        }
    }

    public static void tempConversion(Scanner scanner) {
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose the temperature conversion: ");
        int choice = scanner.nextInt();

        System.out.print("Enter the temperature value: ");
        double value = scanner.nextDouble();
        double result = 0;

        if (choice == 1) {
            result = (value * 9/5) + 32;
            System.out.println(value + " Celsius = " + result + " Fahrenheit");
        } else if (choice == 2) {
            result = (value - 32) * 5/9;
            System.out.println(value + " Fahrenheit = " + result + " Celsius");
        } else {
            System.out.println("Invalid choice.");
        }
    }
}
