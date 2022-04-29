package com.example.interviewbootcamp;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MaxCharsTest {

    @ParameterizedTest
    @MethodSource("givenInputStringAndExpectedChar")
    void shouldReturnTheMostCommonCharInAString(String input, char expected) {
        // when
        char result = MaxChars.maxChar(input);

        // then
        assertThat(result).isEqualTo(expected);
    }

    public static Stream<Arguments> givenInputStringAndExpectedChar() {
        return Stream.of(
                Arguments.of("abcccccccd", 'c'),
                Arguments.of("apple 12311111", '1')
        );
    }
}