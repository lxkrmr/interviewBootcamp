package com.example.interviewbootcamp;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class StepsTest {

    @ParameterizedTest
    @MethodSource("givenNumberOfStepsAndExpectedListOfSteps")
    void shouldReturnListOfSteps(int numberOfSteps, List<String> expectedListOfSteps) {
        // when
        List<String> result = Steps.steps(numberOfSteps);

        // then
        assertThat(result).isEqualTo(expectedListOfSteps);
    }

    private static Stream<Arguments> givenNumberOfStepsAndExpectedListOfSteps() {
        return Stream.of(
                Arguments.of(1, List.of("#")),
                Arguments.of(2, List.of("# ", "##")),
                Arguments.of(3, List.of("#  ", "## ", "###")),
                Arguments.of(4, List.of("#   ", "##  ", "### ", "####"))
        );
    }
}