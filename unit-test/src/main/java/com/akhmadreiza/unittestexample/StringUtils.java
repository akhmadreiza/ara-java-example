package com.akhmadreiza.unittestexample;

public class StringUtils {
    public static boolean isEmpty(String str) {
        return str == null || "".equals(str);
    }

    public static String[] splitString(String inputString) {
        if (isEmpty(inputString)) {
            throw new IllegalStateException("input string cannot be null");
        }
        return inputString.split(" ");
    }
}
