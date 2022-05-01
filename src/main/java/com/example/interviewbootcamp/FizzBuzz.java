package com.example.interviewbootcamp;

public class FizzBuzz {

    public static String fizzBuzz(int input) {
        boolean isMultipleOfThree = isMultipleOfThree(input);
        boolean isMultipleOfFive = isMultipleOfFive(input);

        if(isMultipleOfThree && isMultipleOfFive) {
            return "fizzbuzz";
        }

        if(isMultipleOfThree) {
            return "fizz";
        }

        if(isMultipleOfFive) {
            return "buzz";
        }

        return String.valueOf(input);
    }

    private static boolean isMultipleOfThree(int input) {
        return isMultipleOf(input, 3);
    }

    private static boolean isMultipleOfFive(int input) {
        return isMultipleOf(input, 5);
    }

    private static boolean isMultipleOf(int input, int divisor) {
        return input % divisor == 0;
    }
}
