package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ColorDeleteNth5 {
    public static void main(String[] args) {
        // Create an ArrayList to store colors
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");

        // Display the original list
        System.out.println("Original colors: " + colors);

        // Ask user to enter the position (n) to delete
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the position (n) of the element to delete: ");
        int n = scanner.nextInt();

        // Check if index is valid
        if (n > 0 && n <= colors.size()) {
            String removedColor = colors.remove(n - 1);
            System.out.println("Removed color: " + removedColor);
        } else {
            System.out.println("Invalid position. Please enter a number between 1 and " + colors.size());
        }

        // Display updated list
        System.out.println("Updated colors: " + colors);

        scanner.close();
    }
}
