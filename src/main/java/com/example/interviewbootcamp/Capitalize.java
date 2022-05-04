package com.example.interviewbootcamp;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Capitalize {

    public static String capitalize(String input) {
        return Arrays.stream(input.split(" "))
                     .map(Capitalize::capitalizeWord)
                     .collect(Collectors.joining(" "));
    }

    private static String capitalizeWord(String word) {
        String firstLetterInUpperCase = word.substring(0, 1)
                                            .toUpperCase();
        String restOfTheWord = word.substring(1);
        return "%s%s".formatted(firstLetterInUpperCase,
                                restOfTheWord);
    }
}
