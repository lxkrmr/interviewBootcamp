package com.example.interviewbootcamp;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class StringReversalTest {

    @ParameterizedTest
    @MethodSource("rawAndReversed")
    void shouldReverseString(String raw, String reversed) {
        // when
        String result = StringReversal.reverse(raw);

        // then
        assertThat(result).isEqualTo(reversed);
    }

    public static Stream<Arguments> rawAndReversed() {
        return Stream.of(
                Arguments.of("apple", "elppa"),
                Arguments.of("hello", "olleh"),
                Arguments.of("Greetings!", "!sgniteerG")
        );
    }
}