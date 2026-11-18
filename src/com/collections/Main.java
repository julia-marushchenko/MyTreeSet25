/**
 *  Java program to create, read, update, and delete TreeSet collection.
 */

package com.collections;

import java.util.Set;
import java.util.TreeSet;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Create.
        Set<Double> setOfDoubles = new TreeSet<>();

        // Add.
        setOfDoubles.add(2.1);
        setOfDoubles.add(3.4);
        setOfDoubles.add(1.8);
        setOfDoubles.add(9.6);
        setOfDoubles.add(4.7);

        // Show.
        System.out.println("Set: " + setOfDoubles); // Output: Set: [1.8, 2.1, 3.4, 4.7, 9.6]

        // Update.
        setOfDoubles.remove(1.8);
        setOfDoubles.add(8.1);

        // Show.
        System.out.println("Set: " + setOfDoubles); // Output: Set: [2.1, 3.4, 4.7, 8.1, 9.6]

        // Clear.
        setOfDoubles.clear();

    }
}