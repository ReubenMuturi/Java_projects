import java.util.Scanner;

public class WordCounter {
    // Method to count words in a sentence
    public static int countWords(String input) {
        // Trim any leading/trailing spaces and split based on one or more spaces
        String[] words = input.trim().split("\\s+");

        // If the input is empty after trimming, return 0
        if (input.trim().isEmpty()) {
            return 0;
        }

        // Return the number of words
        return words.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user to input a sentence or paragraph
        System.out.println("Enter a sentence or paragraph: ");
        String input = scanner.nextLine();

        // Call the countWords method and display the result
        int wordCount = countWords(input);
        System.out.println("Total number of words: " + wordCount);

        // Close the scanner object
        scanner.close();
    }
}

