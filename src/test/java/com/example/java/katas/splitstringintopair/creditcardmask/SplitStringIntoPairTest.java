package com.example.java.katas.splitstringintopair.creditcardmask;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

/**
 * Unit test cases for {@link SplitStringIntoPair}
 */
class SplitStringIntoPairTest {

    @ParameterizedTest(name = "value: {0} - expected: {1}")
    @MethodSource("basicTestCases")
    void parameterizedBasicTestCases(final String value, final String[] expected) {
        Assertions.assertArrayEquals(expected, SplitStringIntoPair.split(value));
    }

    /**
     * Generates basic tests cases values
     *
     * @return {@link Stream < Arguments >}
     */
    private static Stream<Arguments> basicTestCases() {
        return Stream.of(
                arguments(null, new String[]{}),
                arguments("", new String[]{}),
                arguments("a", new String[]{"a_"}),
                arguments("ab", new String[]{"ab"}),
                arguments("abc", new String[]{"ab", "c_"}),
                arguments("abcd", new String[]{"ab", "cd"})
        );
    }
}
