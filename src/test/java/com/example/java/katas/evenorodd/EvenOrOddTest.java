package com.example.java.katas.evenorodd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

/**
 * Unit test cases for {@link EvenOrOdd}
 */
class EvenOrOddTest {
    @ParameterizedTest(name = "value: {0} - expected: {1}")
    @MethodSource("basicTestCases")
    void parameterizedBasicTestCases(final int value, final String expected) {
        Assertions.assertEquals(expected, EvenOrOdd.evenOrOdd(value));
    }

    /**
     * Generates basic tests cases values
     *
     * @return {@link Stream < Arguments >}
     */
    private static Stream<Arguments> basicTestCases() {
        return Stream.of(
                arguments(0, "Even"),
                arguments(1, "Odd"),
                arguments(-1, "Odd"),
                arguments(2, "Even"),
                arguments(-2, "Even")
        );
    }
}
