package com.example.interviewbootcamp;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class CapitalizeTest {

    @ParameterizedTest
    @MethodSource("givenInputAndExpectedCapitalizedString")
    void shouldCapitalizeTheFirstLetterOfEachWordInAGivenString(String input, String expected) {
        // when
        String result = Capitalize.capitalize(input);

        // then
        assertThat(result).isEqualTo(expected);
    }

    private static Stream<Arguments> givenInputAndExpectedCapitalizedString() {
        return Stream.of(
                Arguments.of("a short sentence", "A Short Sentence"),
                Arguments.of("a lazy Fox", "A Lazy Fox"),
                Arguments.of("look, it is working!", "Look, It Is Working!")
        );
    }
}