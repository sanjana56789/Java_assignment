package linkedlist;

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListReverse2 {
    public static void main(String[] args) {
        // Create a LinkedList of colors
        LinkedList<String> colors = new LinkedList<>();

        // Add some colors
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");

        // Display the original list
        System.out.println("Original list: " + colors);

        // Get a descending iterator (reverse order)
        Iterator<String> reverseIterator = colors.descendingIterator();

        // Iterate and display elements in reverse order
        System.out.println("LinkedList in reverse order:");
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }
    }
}

