package com.example.java.katas.sumofoddnumbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

/**
 * Unit test cases for {@link SumOfOddNumbers}
 */
class SumOfOddNumbersTest {
    @ParameterizedTest(name = "value: {0} - expected: {1}")
    @MethodSource("basicTestCases")
    void parameterizedBasicTestCases(final int value, final int expected) {
        Assertions.assertEquals(expected, SumOfOddNumbers.sumOfOddNumbers(value));
    }

    /**
     * Generates basic tests cases values
     *
     * @return {@link Stream < Arguments >}
     */
    private static Stream<Arguments> basicTestCases() {
        return Stream.of(
                arguments(0, 0),
                arguments(1, 1),
                arguments(2, 8),
                arguments(3, 27),
                arguments(4, 64),
                arguments(5, 125)
        );
    }
}