package com.example.interviewbootcamp;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Steps {

    public static List<String> steps(int numberOfSteps) {
        return IntStream.range(1, numberOfSteps + 1)
                        .mapToObj(currentStep -> createStep(currentStep, numberOfSteps))
                        .collect(Collectors.toList());
    }

    private static String createStep(int currentStep, int numberOfSteps) {
        return createString('#', currentStep) + createString(' ', numberOfSteps - currentStep);
    }

    private static String createString(Character character, int times) {
        return IntStream.range(0, times)
                        .mapToObj(ignore -> String.valueOf(character))
                        .collect(Collectors.joining());
    }
}
