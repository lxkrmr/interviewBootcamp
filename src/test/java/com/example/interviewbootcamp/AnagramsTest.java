package com.example.interviewbootcamp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class AnagramsTest {

    @ParameterizedTest
    @MethodSource("givenFirstAndSecondWordsAreAnagrams")
    void shouldReturnTrueIfFirstAndSecondWordsAreAnagrams(String firstWord, String secondWord) {
        // when
        boolean result = Anagrams.isAnagram(firstWord, secondWord);

        // then
        assertThat(result).isTrue();
    }

    @Test
    void shouldReturnFalseIfFirstAndSecondWordsAreNotAnagrams() {
        // when
        boolean result = Anagrams.isAnagram("Hi there", "Bye there");

        // then
        assertThat(result).isFalse();
    }

    public static Stream<Arguments> givenFirstAndSecondWordsAreAnagrams() {
        return Stream.of(
                Arguments.of("rail safety", "fairy tales"),
                Arguments.of("RAIL! SAFETY", "fairy tales")
        );
    }
}