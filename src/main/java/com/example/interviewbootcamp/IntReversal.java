package com.example.interviewbootcamp;

import java.util.Objects;

public class IntReversal {

    public static int reverse(int input) {
        String inputAsReversedString = String.valueOf(input)
                              .chars()
                              .mapToObj(c -> (char) c)
                              .map(String::valueOf)
                              .filter(element -> !Objects.equals(element, "-"))
                              .reduce("", (reversed, c) -> c + reversed);

        int reversedInteger = Integer.parseInt(inputAsReversedString);

        return input < 0 ? reversedInteger * -1 : reversedInteger;
    }
}
