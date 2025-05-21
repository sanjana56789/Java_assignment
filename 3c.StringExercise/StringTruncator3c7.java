// 3c.7 Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using Collections.swap(l_list, 0, 2))

package stringhandlingfunc3abc;

import java.util.Scanner;

public class StringTruncator3c7 {
    // Function to truncate a string to maxLength and add ellipsis if needed
    public static String truncate(String str, int maxLength) {
        if (str == null || maxLength <= 0) {
            return "";
        }
        
        if (str.length() <= maxLength) {
            return str;  // No need to truncate
        }

        if (maxLength <= 3) {
            // If maxLength is very small, just return truncated dots
            return "...".substring(0, maxLength);
        }

        // Truncate and add ellipsis
        return str.substring(0, maxLength - 3) + "...";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to truncate: ");
        String input = scanner.nextLine();

        System.out.print("Enter maximum length: ");
        int maxLength = scanner.nextInt();

        String truncated = truncate(input, maxLength);
        System.out.println("Truncated string: " + truncated);

        scanner.close();
    }
}
