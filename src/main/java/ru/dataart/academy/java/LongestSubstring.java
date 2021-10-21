package ru.dataart.academy.java;

import java.util.*;

public class LongestSubstring {
    /**
     * @param checkString - input string to check
     * @return - length of max substring without repeatable characters
     * Example: dnmdncbb  -> 3 (dnm)
     * amam -> 2 (am)
     * dnmdncbb
     */

    public int getLengthOfLongestSubstring(String checkString) {
        //Task implementation
        String longestSubstring = "";
        for (int i = 0; i < checkString.length(); i++) {
            for (int j = 1 + i; j < checkString.length() + 1; j++) {
                String substring = checkString.substring(i,j);
                if (!checkForDuplicateChars(substring) && substring.length() > longestSubstring.length()) {
                    longestSubstring = substring;
                }
            }
        }
        return longestSubstring.length();
    }

    private boolean checkForDuplicateChars(String substring) {
        char[] symbols = substring.toCharArray();
        if (symbols.length == 1) {
            return false;
        }

        Set<Character> characters = new HashSet<>();
        for (char symbol : symbols) {
            characters.add(symbol);
        }
        return characters.size() != symbols.length;
    }
}
