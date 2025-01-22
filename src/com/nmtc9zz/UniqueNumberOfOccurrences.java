package com.nmtc9zz;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurrences {
    public static void main(String[] args) {
        System.out.println(uniqueOccurrences(new int[] { 1, 2, 3, 4, 5 }));
        System.out.println(uniqueOccurrences(new int[] { 1, 2, 2, 1, 1, 3 }));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> numberOfOccurrences = new HashMap<>();
        for (int j : arr) {
            numberOfOccurrences.put(j, numberOfOccurrences.getOrDefault(j, 0) + 1);
        }

        Set<Integer> occurrencesSet = new HashSet<>(numberOfOccurrences.values());
        System.out.println(occurrencesSet.size() + " " + numberOfOccurrences.size());
        return occurrencesSet.size() == numberOfOccurrences.size();
    }
}
