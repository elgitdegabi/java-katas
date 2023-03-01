package com.example.java.katas.localminmax;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

/**
 * Unit test cases for {@link LocalMinMax}
 */
class LocalMinMaxTest {
    @ParameterizedTest(name = "input: {0} - output: {1}")
    @MethodSource("basicTestCases")
    void parameterizedBasicTestCases(final int[] list, final int[][] minMaxList) {
        Assertions.assertArrayEquals(minMaxList, LocalMinMax.getLocalMinMax(list));
        Assertions.assertArrayEquals(minMaxList, LocalMinMax.getLocalMinMaxAlternative(list));
    }

    /**
     * Generates basic tests cases values
     *
     * @return {@link Stream < Arguments >}
     */
    private static Stream<Arguments> basicTestCases() {
        return Stream.of(
                arguments(new int[]{}, new int[][]{{0}, {0}}),
                arguments(null, new int[][]{{0}, {0}}),
                arguments(new int[]{1}, new int[][]{{1}, {1}}),
                arguments(new int[]{1, 1}, new int[][]{{1}, {1}}),
                arguments(new int[]{1, 2, 3, 4}, new int[][]{{1}, {4}}),
                arguments(new int[]{4, 3, 2, 1}, new int[][]{{1}, {4}})
        );
    }
}