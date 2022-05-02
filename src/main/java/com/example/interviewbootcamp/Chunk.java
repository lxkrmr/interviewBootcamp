package com.example.interviewbootcamp;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Chunk {

    public static List<List<Integer>> chunk(List<Integer> array, int chunkSize) {
        return offsets(array.size(), chunkSize).mapToObj(currentOffset -> createSubList(array,
                                                                                        currentOffset,
                                                                                        chunkSize))
                .collect(Collectors.toList());
    }

    private static IntStream offsets(int sizeOfTheArry, int chunkSize) {
        int numberOfChunks = (int) Math.ceil(sizeOfTheArry / (double) chunkSize);
        return IntStream.range(0, numberOfChunks)
                        .map(currentChunk -> currentChunk * chunkSize);

    }

    private static List<Integer> createSubList(List<Integer> array, int offset, int limit) {
        return array.stream()
                    .skip(offset)
                    .limit(limit)
                    .collect(Collectors.toList());
    }
}
