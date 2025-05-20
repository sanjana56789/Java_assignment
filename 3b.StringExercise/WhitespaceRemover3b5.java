package stringhandlingfunc3abc;

import java.util.Scanner;

public class WhitespaceRemover3b5 {
    // Function to remove all whitespace characters from a string
    public static String removeWhitespace(String str) {
        if (str == null) {
            return null;
        }
        // Replace all whitespace characters (spaces, tabs, newlines, etc.) with empty string
        return str.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string with whitespace: ");
        String input = scanner.nextLine();

        String result = removeWhitespace(input);
        System.out.println("String after removing all whitespace: '" + result + "'");

        scanner.close();
    }
}

