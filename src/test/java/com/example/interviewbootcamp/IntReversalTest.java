package com.example.interviewbootcamp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class IntReversalTest {

    @ParameterizedTest
    @MethodSource("intGivenAndExpected")
    void shouldReturnReversedInt(int input, int expected) {
        // when
        int result = IntReversal.reverse(input);

        // then
        assertThat(result).isEqualTo(expected);
    }

    private static Stream<Arguments> intGivenAndExpected() {
        return Stream.of(
               Arguments.of(15, 51),
               Arguments.of(981, 189),
               Arguments.of(500, 5),
               Arguments.of(-15, -51),
               Arguments.of(-90, -9)
        );
    }
}