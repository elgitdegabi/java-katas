package com.example.java.katas.fibonacci;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

class FibonacciElementsTest {
    @ParameterizedTest(name = "value: {0} - expected: {1}")
    @MethodSource("basicTestCases")
    void parameterizedBasicTestCases(final int value, final int[] expected) {
        Assertions.assertArrayEquals(expected, FibonacciElements.getElements(value));
    }

    /**
     * Generates basic tests cases values
     *
     * @return {@link Stream < Arguments >}
     */
    private static Stream<Arguments> basicTestCases() {
        return Stream.of(
                arguments(0, new int[]{}),
                arguments(1, new int[]{1}),
                arguments(2, new int[]{1, 1}),
                arguments(85, new int[]{}),
                arguments(5, new int[]{1, 1, 2, 3, 5}),
                arguments(7, new int[]{1, 1, 2, 3, 5, 8, 13}),
                arguments(9, new int[]{1, 1, 2, 3, 5, 8, 13, 21, 34})
        );
    }
}
