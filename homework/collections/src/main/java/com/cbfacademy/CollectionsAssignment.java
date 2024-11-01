package com.cbfacademy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

public class CollectionsAssignment {

    /**
     * This method removes all values from the provided list that are smaller
     * than the indicated integer. The remaining elements retain their original
     * ordering.
     *
     * @param list   - the list of integers
     * @param minValue the minimum value to retain
     */
    public static void removeSmallInts(List<Integer> list, int minValue) {
        // Your solution must traverse the list from last to first element
        // List<Integer> lists = new ArrayList<>();
        
        // Traverse the list from last to first element and remove all smaller values from the lists
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) < minValue) {
                list.remove(i);
            }
        }

    }

    /**
     * This method returns true if the provided collection contains any
     * duplicate elements.
     *
     * @param integers - a collection of integers
     * @return true if integers contains duplicates, false otherwise
     */
    public static boolean containsDuplicates(Collection<Integer> integers) {
        // Your solution must not use any loops.

        // HashSet implements Set interface, 
        //so they are not allowed to store duplicates objects. REF: geeksforgeeks.org
        // Convert collection to set to remove duplicates and compare sizes
        Collection<Integer> elements = new HashSet<>(integers);
    
        // If sizes differ, duplicates were present
        return integers.size() != elements.size();
    }



    /**
     * This method returns an ArrayList containing all elements that appear in
     * either of the two collection arguments. There will be no duplicate values
     * in the resulting ArrayList. The values in the returned ArrayList must be
     * in sorted order.
     * <p>
     * For example, if the two arguments contain {2, 1, 2, 3} and {3, 4, 4, 5},
     * the returned ArrayList will contain {1, 2, 3, 4, 5}. The original
     * collections will not be modified.
     *
     * @param ints1 - the first collection
     * @param ints2 - the second collection
     * @return A sorted ArrayList containing the integers that appear in either
     * collection.
     */
    public static ArrayList<Integer> inEither(Collection<Integer> ints1, Collection<Integer> ints2) {
        // This must be done with no loops.

        // TreeSet sort the elements according to some Comparator
        Collection<Integer> firstSet = new TreeSet<>(ints1);
        firstSet.addAll(ints2); // Add all elements from second collection

        return new ArrayList<Integer>(firstSet);
    }


    /**
     * This method returns an ArrayList containing all elements that appear in
     * both of the two collection arguments. There will be no duplicate values
     * in the resulting ArrayList. The values in the returned ArrayList must be
     * in sorted order. For example, if the two arguments contain {2, 1, 2, 3} and
     * {3, 4, 4, 5}, the returned ArrayList will contain {3}. The original
     * collections will not be modified.
     *
     * @param ints1 - the first collection
     * @param ints2 - the second collection
     * @return An ArrayList containing the integers that appear in both
     * collections.
     */
    public static ArrayList<Integer> inBoth(Collection<Integer> ints1, Collection<Integer> ints2) {
        // This must be done with no loops.

        // Use TreeSet to sort elements in order and removes duplicate
        Set<Integer> firstSet = new TreeSet<>(ints1);
        firstSet.retainAll(ints2);

        return new ArrayList<Integer>(firstSet);
    }


    /**
     * This method returns the String that appears most frequently in the
     * provided list. For example, if the input list contains the elements
     * {"Bob", "Alice", "Bob"}, this method will return "Bob". If there are
     * ties, any of the most frequently occurring elements may be returned.
     * If the list is empty, return the empty string "".
     *
     * @param list - a list of Strings
     * @return the most frequently occurring String
     */
    public static String mostFrequent(List<String> list) {
        // You should solve this problem in two stages: First iterate through
        // the list to count occurrences of each String. Then iterate through
        // your counts to find the largest. You'll need a collection that allows
        // you to store a mapping from Strings to counts.
        // No nested loops or non-enhanced for-loops are allowed.

        // Handle empty list case
        if (list.isEmpty()) {
            return "";
        }

        // Use HashMap to count occurrences
        Map<String, Integer> occurrencesMap = new HashMap<>();

        // iteration from last to first occurrence
        for (int i = list.size() - 1; i >= 0; i--) {

            String currentStr = list.get(i);
            occurrencesMap.put(currentStr, occurrencesMap.getOrDefault(currentStr, 0) + 1); // getOrDefault() increment string counts
        }

       // The most frequent string
        String mostFrequent = "";
        int largestCount = 0;

        // using entrySet() to find the string with the largest count
        for (Map.Entry<String, Integer> entry : occurrencesMap.entrySet()) {
            if (entry.getValue() > largestCount) {
                mostFrequent = entry.getKey();
                largestCount = entry.getValue();
            }
        }
        return mostFrequent;
    }
    

    public static String getName() {
        return "Collections Assignment";
    }
}
