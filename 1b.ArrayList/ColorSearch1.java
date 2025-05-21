// 1b.1 Write a java program for getting different colors through ArrayList interface and search whether the color "Red" is available or not

package arraylist;

import java.util.ArrayList;

public class ColorSearch1 {
    public static void main(String[] args) {
        // Create an ArrayList to store colors
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the ArrayList
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Black");

        // Display all colors
        System.out.println("Available colors: " + colors);

        // Check if "Red" is in the list
        if (colors.contains("Red")) {
            System.out.println("The color 'Red' is available.");
        } else {
            System.out.println("The color 'Red' is not available.");
        }
    }
}
