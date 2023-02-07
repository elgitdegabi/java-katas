package com.example.java.katas.splitstringintopair.creditcardmask;

/**
 * Based on Code-wars kata:
 * https://www.codewars.com/kata/515de9ae9dcfc28eb6000001/train/java
 */
public class SplitStringIntoPair {

    /**
     * Splits given string into pairs. If original string has odd length, it should be completed with _ character
     *
     * @param str string
     * @return string array of pairs
     */
    public static String[] split(String str) {
        if (str != null && str.length() > 0) {
            if (str.length() % 2 != 0) {
                str += "_";
            }

            String[] result = new String[str.length() / 2];
            for (int i = 0; i < result.length; i++) {
                result[i] = str.substring(i * 2, i * 2 + 2);
            }

            return result;
        }

        return new String[]{};
    }
}
