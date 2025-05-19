package linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIteratorExample1 {
    public static void main(String[] args) {
        // Create a LinkedList of colors
        LinkedList<String> colors = new LinkedList<>();

        // Add some colors to the list
        colors.add("Red");     // index 0
        colors.add("Blue");    // index 1 (start from here)
        colors.add("Green");   // index 2
        colors.add("Yellow");  // index 3
        colors.add("Black");   // index 4

        // Display original list
        System.out.println("All colors: " + colors);

        // Create a ListIterator starting from index 1 (2nd element)
        ListIterator<String> iterator = colors.listIterator(1);

        // Iterate from 2nd element onward
        System.out.println("Iterating from 2nd element:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
