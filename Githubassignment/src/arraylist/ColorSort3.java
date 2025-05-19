package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ColorSort3 {
    public static void main(String[] args) {
        // Create an ArrayList to store colors
        ArrayList<String> colors = new ArrayList<>();

        // Add colors to the ArrayList
        colors.add("Red");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Black");

        // Display original list
        System.out.println("Original colors: " + colors);

        // Sort the list using Collections.sort()
        Collections.sort(colors);

        // Display sorted list
        System.out.println("Sorted colors: " + colors);
    }
}
