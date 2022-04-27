package com.example.interviewbootcamp;

public class Palindromes {

    public static Boolean palindrome(String input) {
        return input.chars()
                    .mapToObj(i -> (char) i)
                    .map(String::valueOf)
                    .reduce("", (reversed, character) -> character + reversed)
                    .equals(input);
    }
}
