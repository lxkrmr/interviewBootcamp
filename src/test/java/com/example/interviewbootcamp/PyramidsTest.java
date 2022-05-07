package com.example.interviewbootcamp;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class PyramidsTest {

    @ParameterizedTest
    @MethodSource("givenNumberOfLevelsAndExpectedPyramid")
    void shouldLogPyramid(int numerOfLevels, List<String> expectedPyramid) {
        // when
        List<String> result = Pyramids.payramid(2);

        // then
        assertThat(result).isEqualTo(expectedPyramid);
    }

    private static Stream<Arguments> givenNumberOfLevelsAndExpectedPyramid() {
        return Stream.of(
                Arguments.of(1,
                             List.of("#")
                ),
                Arguments.of(2,
                             List.of(" # ",
                                     "###")
                ),
                Arguments.of(3,
                             List.of("  #  ",
                                     " ### ",
                                     "#####")
                ),
                Arguments.of(4,
                             List.of("   #   ",
                                     "  ###  ",
                                     " ##### ",
                                     "#######")
                )
        );
    }
}