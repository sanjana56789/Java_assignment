// 3b.3 Write a Java Program for Reversing the characters in a string using user defined function reverseString().

package stringhandlingfunc3abc;

import java.util.Scanner;

public class StringReverser3b3 {
    // Function to reverse a string
    public static String reverseString(String str) {
        if (str == null) {
            return null;
        }

        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();

        String reversedString = reverseString(input);
        System.out.println("Reversed string: " + reversedString);

        scanner.close();
    }
}
