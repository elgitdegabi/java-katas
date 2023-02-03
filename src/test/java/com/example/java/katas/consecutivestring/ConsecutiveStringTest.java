package com.example.java.katas.consecutivestring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

/**
 * Unit test cases for {@link ConsecutiveString}
 */
class ConsecutiveStringTest {
    @ParameterizedTest(name = "array: {0} - k: {1} - expected: {2}")
    @MethodSource("basicTestCases")
    void parameterizedBasicTestCases(final String[] array, final int k, final String expected) {
        Assertions.assertEquals(expected, ConsecutiveString.consecutiveString(array, k));
    }

    /**
     * Generates basic tests cases values
     *
     * @return {@link Stream < Arguments >}
     */
    private static Stream<Arguments> basicTestCases() {
        return Stream.of(
                arguments(new String[]{"a", "b", "cd", "efg"}, 2, "cdefg"),
                arguments(new String[]{"tree", "foling", "trashy", "blue", "abcdef", "uvwxyz"}, 2, "folingtrashy"),
                arguments(new String[]{"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 2, "abigailtheta"),
                arguments(new String[]{"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"}, 1, "oocccffuucccjjjkkkjyyyeehh"),
                arguments(new String[]{}, 3, ""),
                arguments(new String[]{"itvayloxrp", "wkppqsztdkmvcuwvereiupccauycnjutlv", "vweqilsfytihvrzlaodfixoyxvyuyvgpck"}, 2, "wkppqsztdkmvcuwvereiupccauycnjutlvvweqilsfytihvrzlaodfixoyxvyuyvgpck"),
                arguments(new String[]{"wlwsasphmxx", "owiaxujylentrklctozmymu", "wpgozvxxiu"}, 2, "wlwsasphmxxowiaxujylentrklctozmymu"),
                arguments(new String[]{"zone", "abigail", "theta", "form", "libe", "zas"}, -2, ""),
                arguments(new String[]{"it", "wkppv", "ixoyx", "3452", "zzzzzzzzzzzz"}, 3, "ixoyx3452zzzzzzzzzzzz"),
                arguments(new String[]{"it", "wkppv", "ixoyx", "3452", "zzzzzzzzzzzz"}, 15, ""),
                arguments(new String[]{"it", "wkppv", "ixoyx", "3452", "zzzzzzzzzzzz"}, 0, "")
        );
    }
}
