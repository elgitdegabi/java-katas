package com.example.java.katas.fibonacci;

/**
 * Based on Code-wars kata:
 * https://practice.geeksforgeeks.org/problems/print-first-n-fibonacci-numbers1002/1
 */
public class FibonacciElements {

    /**
     * Returns first K fibonacci elements
     * @param k int
     * @return int[]
     */
    public static int[] getElements(final int k) {
        if (k < 1 || k > 84) {
            return new int[]{};
        }

        int [] result = new int[k];
        for (int i = 0; i < k; i++) {
            if (i < 2) {
                result[i] = 1;
            } else {
                result[i] = result[i - 1] + result[i - 2];
            }
        }

        return result;
    }
}
