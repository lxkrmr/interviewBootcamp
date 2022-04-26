package com.example.interviewbootcamp;

public class StringReversal {

    public static String reverse(String input) {
        return input.chars()
                    .mapToObj(c -> (char) c)
                    .map(String::valueOf)
                    .reduce("", (rev, c) -> c + rev);
    }
}
