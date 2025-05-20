package linkedlist;

import java.util.LinkedList;

public class LinkedListOfferLast3 {
    public static void main(String[] args) {
        // Create a LinkedList of colors
        LinkedList<String> colors = new LinkedList<>();

        // Add some initial colors
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");

        // Display the original list
        System.out.println("Original LinkedList: " + colors);

        // Insert "Pink" at the end using offerLast()
        colors.offerLast("Pink");

        // Display the updated list
        System.out.println("Updated LinkedList after adding 'Pink' at the end: " + colors);
    }
}
