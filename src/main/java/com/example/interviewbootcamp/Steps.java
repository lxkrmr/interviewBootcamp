package com.example.interviewbootcamp;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Steps {

    public static List<String> steps(int steps) {
        return IntStream.range(0, steps)
                        .mapToObj(currentRow -> createRow(currentRow, steps))
                        .collect(Collectors.toList());
    }

    private static String createRow(int currentRow, int steps) {
        return IntStream.range(0, steps)
                        .mapToObj(currentColumn -> createCell(currentRow, currentColumn))
                        .collect(Collectors.joining());
    }

    private static String createCell(int currentRow, int currentColumn) {
        if (currentColumn <= currentRow) {
            return "#";
        }

        return " ";
    }
}
