package com.example.java.katas.creditcardmask;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

/**
 * Unit test cases for {@link CreditCardMask}
 */
class CreditCardMaskTest {

    @ParameterizedTest(name = "value: {0} - expected: {1}")
    @MethodSource("basicTestCases")
    void parameterizedBasicTestCases(final String value, final String expected) {
        Assertions.assertEquals(expected, CreditCardMask.maskify(value));
    }

    /**
     * Generates basic tests cases values
     *
     * @return {@link Stream < Arguments >}
     */
    private static Stream<Arguments> basicTestCases() {
        return Stream.of(
                arguments(null, null),
                arguments("", ""),
                arguments("abc", "abc"),
                arguments("abcd", "abcd"),
                arguments("4556364607935616", "############5616"),
                arguments("64607935616", "#######5616"),
                arguments("Skippy", "##ippy"),
                arguments("Nananananananananananananananana Batman!", "####################################man!")
        );
    }
}
