package com.example.java.katas.twooldestage;

import java.util.Arrays;

/**
 * Based on Code-wars kata:
 * https://www.codewars.com/kata/511f11d355fe575d2c000001/java
 */
public class TwoOldestAge {

    /**
     * Gets two oldest ages from given array of ages
     *
     * @param ages int array of ages
     * @return int array with two oldest ages
     */
    public static int[] twoOldestAges(int[] ages) {
        if (ages == null || ages.length < 2) {
            return new int[]{};
        }

        return Arrays.stream(ages).sorted().skip(ages.length - 2).toArray();
        /* old fashion solution
        int[] oldest = new int[2];
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] > 0) {
                for (int j = oldest.length - 1; j >= 0; j--) {
                    if (ages[i] > oldest[j]) {
                        if (j > 0) {
                            oldest[j - 1] = oldest[j];
                        }
                        oldest[j] = ages[i];
                        break;
                    }
                }
            }
        }

        return oldest;*/
    }
}
