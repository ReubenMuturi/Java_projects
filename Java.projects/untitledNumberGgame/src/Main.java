import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int guess = random.nextInt(0, 5);
        boolean correctGuess = false;
        int trials = 0;

        System.out.println("Welcome to the number guessing game!");
        System.out.println("I have made my guess");

        while (!correctGuess) {
            System.out.println("Enter your guess: ");
            int userGuess = scanner.nextInt();
            trials++;

            if (userGuess < 0 && userGuess > 5) {
                System.out.println("Please guess a number within the range of 1 to 100.");
            } else if (userGuess < guess) {
                System.out.println("Guess is low");
            } else if (userGuess > guess) {
                System.out.println("Guess is high");
            } else {
                System.out.println(correctGuess = true);
                System.out.println("You got it right");
            }
        }
    scanner.close();
    }
}