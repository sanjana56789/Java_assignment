package thirdexercise;

import java.util.Scanner;

public class NullOrEmptyCheck3b1 {
    // User-defined function to check if string is null or only whitespace
    public static boolean isNullOrEmpty(String str) {
        // Check if string is null or after trimming is empty
        return (str == null || str.trim().isEmpty());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();
        
        if (isNullOrEmpty(input)) {
            System.out.println("The string is either null or contains only whitespace.");
        } else {
            System.out.println("The string is not null and contains non-whitespace characters.");
        }

        scanner.close();
    }
}

