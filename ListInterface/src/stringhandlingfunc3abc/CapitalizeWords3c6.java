package stringhandlingfunc3abc;

import java.util.Scanner;

public class CapitalizeWords3c6 {
    // Function to capitalize the first letter of each word
    public static String capitalizeWords(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        String[] words = str.split("\\s+"); // Split by whitespace
        StringBuilder capitalized = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                // Capitalize first letter and add remaining letters in lowercase
                capitalized.append(Character.toUpperCase(word.charAt(0)));
                if (word.length() > 1) {
                    capitalized.append(word.substring(1).toLowerCase());
                }
                capitalized.append(" ");
            }
        }

        return capitalized.toString().trim(); // Remove trailing space
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to capitalize each word: ");
        String input = scanner.nextLine();

        String result = capitalizeWords(input);
        System.out.println("Capitalized string: " + result);

        scanner.close();
    }
}
