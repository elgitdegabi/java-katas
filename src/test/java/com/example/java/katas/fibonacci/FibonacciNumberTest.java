package com.example.java.katas.fibonacci;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

class FibonacciNumberTest {
    @ParameterizedTest(name = "value: {0} - expected: {1}")
    @MethodSource("basicTestCases")
    void parameterizedBasicTestCases(final int value, final BigDecimal expected) {
        Assertions.assertEquals(expected, FibonacciNumber.calculate(value));
    }

    @ParameterizedTest(name = "value: {0} - expected: {1}")
    @MethodSource("complexTestCases")
    void parameterizedComplexTestCases(final int value, final BigDecimal expected) {
        Assertions.assertEquals(expected, FibonacciNumber.calculate(value, new HashMap<>()));
    }

    /**
     * Generates basic tests cases values
     *
     * @return {@link Stream < Arguments >}
     */
    private static Stream<Arguments> basicTestCases() {
        return Stream.of(
                arguments(0, BigDecimal.ZERO),
                arguments(1, BigDecimal.ONE),
                arguments(2, BigDecimal.ONE),
                arguments(5, BigDecimal.valueOf(5)),
                arguments(7, BigDecimal.valueOf(13)),
                arguments(9, BigDecimal.valueOf(34)),
                arguments(45, BigDecimal.valueOf(1134903170))
        );
    }

    /**
     * Generates complex tests cases values
     *
     * @return {@link Stream < Arguments >}
     */
    private static Stream<Arguments> complexTestCases() {
        Stream complexCases = Stream.of(
                arguments(85, new BigDecimal("259695496911122585")),
                arguments(99, new BigDecimal("218922995834555169026"))
        );

        return Stream.concat(basicTestCases(), complexCases);
    }
}
