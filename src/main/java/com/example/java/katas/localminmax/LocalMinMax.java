package com.example.java.katas.localminmax;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Based on Google interview challenge
 */
public class LocalMinMax {

    /**
     * Get local min and max values from given int array
     *
     * @param list int[]
     * @return int[][] matrix with min and max
     */
    public static int[][] getLocalMinMax(final int[] list) {
        int[][] result = new int[2][1];

        if (list != null && list.length > 0) {
            int min = Arrays.stream(list).mapToObj(value -> value).min(Comparator.naturalOrder()).get();
            int max = Arrays.stream(list).mapToObj(value -> value).max(Comparator.naturalOrder()).get();

            result[0][0] = min;
            result[1][0] = max;
        }

        return result;
    }

    /**
     * Get local min and max values from given int array
     *
     * @param list int[]
     * @return int[][] matrix with min and max
     */
    public static int[][] getLocalMinMaxAlternative(final int[] list) {
        int[][] result = new int[2][1];

        if (list != null && list.length > 0) {
            Arrays.sort(list);
            result[0][0] = list[0];
            result[1][0] = list[list.length - 1];
        }

        return result;
    }
}
