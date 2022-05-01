package com.example.interviewbootcamp;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzTest {

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 12, 18})
    void shouldReturnFizzIfNumberIsMultipleOfThreeAndNotMultipleOfFive(int multipleOfThree) {
        // when
        String result = FizzBuzz.fizzBuzz(multipleOfThree);

        // then
        assertThat(result).isEqualTo("fizz");
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20, 25, 35})
    void shouldReturnBuzzIfNumberIsMultipleOfFiveAndNotMultipleOfThree(int multipleOfFive) {
        // when
        String result = FizzBuzz.fizzBuzz(multipleOfFive);

        // then
        assertThat(result).isEqualTo("buzz");
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45, 60, 75})
    void shouldReturnFizzbuzzIfNumberIsMultipleOfFiveAndMultipleOfThree(int multipleOfThreeAndFive) {
        // when
        String result = FizzBuzz.fizzBuzz(multipleOfThreeAndFive);

        // then
        assertThat(result).isEqualTo("fizzbuzz");
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 4, 7, 8})
    void shouldReturnNumberAsStringIfNumberIsNotMultipleOfFiveAndNotMultipleOfThree(int notMultipleOfThreeAndFive) {
        // when
        String result = FizzBuzz.fizzBuzz(notMultipleOfThreeAndFive);

        // then
        assertThat(result).isEqualTo(String.valueOf(notMultipleOfThreeAndFive));
    }
}