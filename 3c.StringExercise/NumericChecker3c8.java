// 3c.8 Write a Java Program for Verifying if a string contains only numeric characters using user defined function isNumeric()


package stringhandlingfunc3abc;

import java.util.Scanner;

public class NumericChecker3c8 {
    // Function to check if the string contains only numeric characters
    public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        // Check each character if it's a digit
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check if numeric: ");
        String input = scanner.nextLine();

        if (isNumeric(input)) {
            System.out.println("The string contains only numeric characters.");
        } else {
            System.out.println("The string contains non-numeric characters.");
        }

        scanner.close();
    }
}

