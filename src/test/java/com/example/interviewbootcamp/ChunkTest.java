package com.example.interviewbootcamp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class ChunkTest {

    @ParameterizedTest
    @MethodSource("givenOrigArrayChunkSizeAndExpectedChunkArrays")
    void shouldReturnExpectedChunkArrays(List<Integer> origArray,
                                         int chunkSize,
                                         List<List<Integer>> expectedChunkArrays) {
        // when
        List<List<Integer>> result = Chunk.chunk(origArray, chunkSize);

        // then
        assertThat(result).isEqualTo(expectedChunkArrays);
    }

    public static Stream<Arguments> givenOrigArrayChunkSizeAndExpectedChunkArrays() {
        return Stream.of(
                Arguments.of(List.of(1, 2, 3, 4),
                             2,
                             List.of(List.of(1, 2),
                                     List.of(3, 4)
                             )
                ),
                Arguments.of(List.of(1, 2, 3, 4, 5),
                             2,
                             List.of(List.of(1, 2),
                                     List.of(3, 4),
                                     List.of(5)
                             )
                ),
                Arguments.of(List.of(1, 2, 3, 4, 5, 6, 7, 8),
                             3,
                             List.of(List.of(1, 2, 3),
                                     List.of(4, 5, 6),
                                     List.of(7, 8)
                             )
                ),
                Arguments.of(List.of(1, 2, 3, 4, 5),
                             4,
                             List.of(List.of(1, 2, 3, 4),
                                     List.of(5)
                             )
                )
        );
    }
}