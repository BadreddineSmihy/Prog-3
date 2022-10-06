package Semaine04;

import java.util.*;

public class TriSimple {
    public static void main(String[] args) {
        // Creating an array list
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements
        numbers.add(4);
        numbers.add(2);
        numbers.add(3);
        System.out.println("Unsorted ArrayList: " + numbers);

        // Using the sort() method
        Collections.sort(numbers);
        System.out.println("Sorted ArrayList: " + numbers);

        numbers.sort(Collections.reverseOrder());
        System.out.println("Sorted Reverse ArrayList: " + numbers);


    }

}








