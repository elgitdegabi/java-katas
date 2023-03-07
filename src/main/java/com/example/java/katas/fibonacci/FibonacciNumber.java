package com.example.java.katas.fibonacci;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.Map;

/**
 * Based on Interview challenge:
 * Calculate Nth Fibonacci number and optimize your solution to support "big numbers"
 */
@Slf4j
public class FibonacciNumber {

    private static final int MAX_SUPPORTED_VALUE = 99;

    /**
     * Returns fibonacci Nth number
     *
     * @param k int
     * @return {@link BigDecimal}
     */
    public static BigDecimal calculate(final int k) {
        if (k < 1 || k > MAX_SUPPORTED_VALUE) {
            return BigDecimal.ZERO;
        }
        if (k <= 2) {
            return BigDecimal.ONE;
        }

        return calculate(k - 1).add(calculate(k - 2));
    }

    /**
     * Returns fibonacci Nth number using memoization
     *
     * @param k int
     * @return {@link BigDecimal}
     */
    public static BigDecimal calculate(final int k, final Map<Integer, BigDecimal> customCache) {
        if (k < 1 || k > MAX_SUPPORTED_VALUE) {
            return BigDecimal.ZERO;
        }
        if (customCache.containsKey(k)) {
            return customCache.get(k);
        }
        if (k <= 2) {
            customCache.put(Integer.valueOf(k), BigDecimal.ONE);
            return BigDecimal.ONE;
        }

        BigDecimal beforePrevious = calculate(k - 2, customCache);
        BigDecimal previous = calculate(k - 1, customCache);
        BigDecimal current = beforePrevious.add(previous);

        customCache.put(Integer.valueOf(k), current);

        return current;
    }
}
