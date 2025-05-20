package stringhandlingfunc3abc;

import java.util.Scanner;

public class WordCounter3c10 {
    // Function to count words in a string
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }

        // Split string by whitespace (one or more spaces, tabs, etc.)
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to count words: ");
        String input = scanner.nextLine();

        int wordCount = countWords(input);
        System.out.println("Number of words: " + wordCount);

        scanner.close();
    }
}

