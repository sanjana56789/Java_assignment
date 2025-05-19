package arraylist;

import java.util.*;

public class ListOperationsDemo1a {
    public static void main(String[] args) {
        // 1. Create ArrayList and LinkedList
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        // 1. Adding elements
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // 2. Adding element at specific index
        arrayList.add(1, "Grapes");
        linkedList.add(1, "Grapes");

        // 3. Adding multiple elements
        List<String> moreFruits = Arrays.asList("Mango", "Papaya");
        arrayList.addAll(moreFruits);
        linkedList.addAll(moreFruits);

        // 4. Accessing elements
        System.out.println("Element at index 2 in ArrayList: " + arrayList.get(2));
        System.out.println("Element at index 2 in LinkedList: " + linkedList.get(2));

        // 5. Updating elements
        arrayList.set(0, "Kiwi");
        linkedList.set(0, "Kiwi");

        // 6. Removing elements
        arrayList.remove("Grapes");
        linkedList.remove(1); // Removes element at index 1

        // 7. Searching elements
        System.out.println("Does ArrayList contain 'Mango'? " + arrayList.contains("Mango"));
        System.out.println("Index of 'Papaya' in LinkedList: " + linkedList.indexOf("Papaya"));

        // 8. List size
        System.out.println("ArrayList size: " + arrayList.size());
        System.out.println("LinkedList size: " + linkedList.size());

        // 9. Iterating over list (enhanced for loop)
        System.out.println("\nIterating ArrayList:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        System.out.println("\nIterating LinkedList:");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }

        // 10. Using Iterator
        System.out.println("\nUsing Iterator on ArrayList:");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 11. Sorting
        Collections.sort(arrayList);
        Collections.sort(linkedList);
        System.out.println("\nSorted ArrayList: " + arrayList);
        System.out.println("Sorted LinkedList: " + linkedList);

        // 12. Sublist
        List<String> subArrayList = arrayList.subList(1, 3); // index 1 and 2
        System.out.println("Sublist of ArrayList (1 to 2): " + subArrayList);

        // 13. Clearing the list
        arrayList.clear();
        linkedList.clear();
        System.out.println("ArrayList after clearing: " + arrayList);
        System.out.println("LinkedList after clearing: " + linkedList);
    }
}
