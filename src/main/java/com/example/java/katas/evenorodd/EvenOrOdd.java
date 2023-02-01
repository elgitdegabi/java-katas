package com.example.java.katas.evenorodd;

/**
 * Based on Code-wars kata:
 * https://www.codewars.com/kata/53da3dbb4a5168369a0000fe/java
 */
public class EvenOrOdd {

    /**
     * Returns if given number is even or odd
     * @param number int
     * @return {@link String}
     */
    public static String evenOrOdd(final int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}
