package com.example.java.katas.twooldestage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

/**
 * Unit test cases for {@link TwoOldestAge}
 */
class TwoOldestAgeTest {

    @ParameterizedTest(name = "value: {0} - expected: {1}")
    @MethodSource("basicTestCases")
    void parameterizedBasicTestCases(final int[] value, final int[] expected) {
        Assertions.assertArrayEquals(expected, TwoOldestAge.twoOldestAges(value));
    }

    /**
     * Generates basic tests cases values
     *
     * @return {@link Stream < Arguments >}
     */
    private static Stream<Arguments> basicTestCases() {
        return Stream.of(
                arguments(null, new int[]{}),
                arguments(new int[]{}, new int[]{}),
                arguments(new int[]{1}, new int[]{}),
                arguments(new int[]{0, 0}, new int[]{0, 0}),
                arguments(new int[]{5, 10}, new int[]{5, 10}),
                arguments(new int[]{1, 3, 10, 0}, new int[]{3, 10}),
                arguments(new int[]{1, 2, 10, 8}, new int[]{8, 10}),
                arguments(new int[]{1, 5, 87, 45, 8, 8}, new int[]{45, 87}),
                arguments(new int[]{2, 5, 87, 45, 8, 8}, new int[]{45, 87}),
                arguments(new int[]{6, 5, 83, 5, 3, 18}, new int[]{18, 83}),
                arguments(new int[]{6, 5, 83, 5, 3, 18}, new int[]{18, 83})
        );
    }
}
