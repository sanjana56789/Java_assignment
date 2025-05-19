package arraylist;

import java.util.ArrayList;

public class ColorRemove2 {
    public static void main(String[] args) {
        // Create an ArrayList to store colors
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");

        // Display original list
        System.out.println("Original colors: " + colors);

        // Remove the 2nd element (index 1)
        if (colors.size() > 1) {
            String removedElement = colors.remove(1);
            System.out.println("Removed 2nd element: " + removedElement);
        }

        // Remove the color "Blue"
        boolean removedBlue = colors.remove("Blue");
        if (removedBlue) {
            System.out.println("Removed color: Blue");
        } else {
            System.out.println("Color 'Blue' not found.");
        }

        // Display updated list
        System.out.println("Updated colors: " + colors);
    }
}
