package org.com.spootify.helpers;

public class StringHelpers {
    public static boolean isBlank(String str) {
        return str == null || str.trim().isEmpty();
    }
}
