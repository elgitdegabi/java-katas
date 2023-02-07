package com.example.java.katas.creditcardmask;

/**
 * Based on Code-wars kata:
 * https://www.codewars.com/kata/5412509bd436bd33920011bc/train/java
 */
public class CreditCardMask {

    /**
     * Generates a mask for given str except last 4 characters
     *
     * @param str string
     * @return string with masked values
     */
    public static String maskify(final String str) {
        if (str != null && str.length() > 4) {
            String mask = "";
            for (int i = 0; i < str.length() - 4; i++) {
                mask += "#";
            }

            return mask + str.substring(str.length() - 4);
        }

        return str;
    }
}
