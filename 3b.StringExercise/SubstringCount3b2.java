// 3b.2 Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using Collections.swap(l_list, 0, 2))

package stringhandlingfunc3abc;

import java.util.Scanner;

public class SubstringCount3b2 {
    // Function to count occurrences of substring in main string
    public static int countOccurrences(String mainStr, String subStr) {
        if (mainStr == null || subStr == null || subStr.isEmpty()) {
            return 0;
        }

        int count = 0;
        int index = 0;

        // Loop to find all occurrences of subStr in mainStr
        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length();  // Move past the last found substring
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        System.out.print("Enter the substring to count: ");
        String substring = scanner.nextLine();

        int occurrences = countOccurrences(mainString, substring);
        System.out.println("The substring '" + substring + "' appears " + occurrences + " times in the main string.");

        scanner.close();
    }
}
