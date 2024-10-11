import java.util.Random;
import java.util.Scanner;

public class Main {
    public static String generatePassword(int length) {
        String LowerAlphabets = "abcdefghijklmnopqrstuvwxyz";
        String UpperAlphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String specialCharacters = "!@#$%^&*()-_=+<>?";

        String allCharacters = LowerAlphabets + UpperAlphabets + numbers + specialCharacters;

        Random random = new Random();
        StringBuilder password = new StringBuilder(allCharacters.length());


        // Generate random characters for the password
        for (int i=0; i<length; i++) {
            int randomIndex = random.nextInt(allCharacters.length());
            password.append(allCharacters.charAt(randomIndex));
        }

        return password.toString(); // Return the generated string

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for password length
        System.out.print("Enter the length of the password: ");
        int length = scanner.nextInt();

        // Generate and display the password
        String password = generatePassword(length);
        System.out.println("Generated password: " + password);

        // Close the scanner

        scanner.close();
    }
}