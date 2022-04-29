package com.example.interviewbootcamp;

import java.util.HashMap;
import java.util.Map;

public class MaxChars {

    public static String maxChar(String input) {
        if (input == null) {
            return null;
        }

        HashMap<String, Integer> charAsStringAndItOccurrences = new HashMap<>();
        populateStringWithOccurrences(input, charAsStringAndItOccurrences);
        return getMostCommonString(charAsStringAndItOccurrences);
    }

    private static void populateStringWithOccurrences(String input, HashMap<String, Integer> charAsStringAndItOccurrences) {
        input.chars()
             .mapToObj(i -> (char) i)
             .map(String::valueOf)
             .forEach(charAsStr -> {
                 Integer occurencesOfCharWithDefaultZero = charAsStringAndItOccurrences.getOrDefault(charAsStr, 0);
                 Integer updatedOccurences = occurencesOfCharWithDefaultZero + 1;
                 charAsStringAndItOccurrences.put(charAsStr, updatedOccurences);
             });
    }

    private static String getMostCommonString(HashMap<String, Integer> charAsStringAndItOccurrences) {
        Map.Entry<String, Integer> maybeResult = charAsStringAndItOccurrences.entrySet()
                                                                             .stream()
                                                                             .reduce(null, (entryWithHighestOccurrence, currentEntry) -> {
                                                                                 if (entryWithHighestOccurrence == null) {
                                                                                     return currentEntry;
                                                                                 }

                                                                                 if (entryWithHighestOccurrence.getValue() >= currentEntry.getValue()) {
                                                                                     return entryWithHighestOccurrence;
                                                                                 }

                                                                                 return currentEntry;
                                                                             });

        return maybeResult == null ? null : maybeResult.getKey();
    }
}
