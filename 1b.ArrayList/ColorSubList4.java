// 1b.4 Write a Java program to display elements and their positions in a linked list ( using l_listobj.get(p) )

package arraylist;

import java.util.ArrayList;
import java.util.List;

public class ColorSubList4 {
    public static void main(String[] args) {
        // Create an ArrayList to store colors
        ArrayList<String> colors = new ArrayList<>();

        // Add colors to the ArrayList
        colors.add("Red");      // index 0
        colors.add("Blue");     // index 1
        colors.add("Green");    // index 2
        colors.add("Yellow");   // index 3
        colors.add("Black");    // index 4

        // Display original list
        System.out.println("Original colors: " + colors);

        // Extract 1st and 2nd elements (index 0 and 1) using subList
        List<String> subColors = colors.subList(0, 2);

        // Display extracted elements
        System.out.println("Extracted elements (1st and 2nd): " + subColors);
    }
}
