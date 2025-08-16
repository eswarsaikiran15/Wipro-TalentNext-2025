package Collection.set;

import java.util.*;

public class TreeSetOperations {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Mango");
        treeSet.add("Cherry");

        // a) Reverse the elements
        System.out.println("TreeSet in reverse order:");
        Iterator<String> descItr = treeSet.descendingIterator();
        while (descItr.hasNext()) {
            System.out.println(descItr.next());
        }

        // b) Iterate normally
        System.out.println("TreeSet in natural order:");
        Iterator<String> itr = treeSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // c) Check if element exists
        String check = "Apple";
        if (treeSet.contains(check)) {
            System.out.println(check + " exists in TreeSet.");
        } else {
            System.out.println(check + " does not exist in TreeSet.");
        }
    }
}
