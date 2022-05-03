package com.example.interviewbootcamp;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Anagrams {

    public static boolean isAnagram(String firstWord, String secondWord) {
        Map<Character, Integer> firstWordAsMap = toMapOfCharacterAndOccurences(onlyLowerCaseCharacters(firstWord));
        Map<Character, Integer> secondWordAsMap = toMapOfCharacterAndOccurences(onlyLowerCaseCharacters(secondWord));


        return isAnagram(firstWordAsMap, secondWordAsMap);
    }

    private static Stream<Character> onlyLowerCaseCharacters(String raw) {
        return raw.toLowerCase()
                  .replaceAll("[^a-z]", "")
                  .chars()
                  .mapToObj(charAsInt -> (char) charAsInt);
    }

    private static Map<Character, Integer> toMapOfCharacterAndOccurences(Stream<Character> characterStream) {
        HashMap<Character, Integer> result = new HashMap<>();
        characterStream.forEach(character -> {
            Integer updatedOccurrenceOfCharacter = result.getOrDefault(character, 0) + 1;
            result.put(character, updatedOccurrenceOfCharacter);
        });
        return result;
    }

    private static boolean isAnagram(Map<Character, Integer> firstWordAsMap, Map<Character, Integer> secondWordAsMap) {
        if(firstWordAsMap.entrySet().size() != secondWordAsMap.entrySet().size()) {
            return false;
        }

        return firstWordAsMap.entrySet()
                             .stream()
                             .map(entryInFirstWord -> {
                                 Integer occurrenceOfCharacterInSecondWord = secondWordAsMap.get(entryInFirstWord.getKey());
                                 return occurrenceOfCharacterInSecondWord != null
                                         && occurrenceOfCharacterInSecondWord.equals(entryInFirstWord.getValue());
                             })
                             .filter(characterHasSameOccurrencesInBothWord -> !characterHasSameOccurrencesInBothWord)
                             .findFirst()
                             .orElse(true);
    }
}
