package org.example;

public class StringUtils {
    /**
     * Checks if a given string is a palindrome, ignoring non-alphanumeric characters
     * and case sensitivity. A palindrome is a word, phrase, number, or other sequence
     * of characters that reads the same forward and backward.
     *
     * @param s the string to check
     * @return true if the string is a palindrome, false otherwise
     * @throws IllegalArgumentException if the input string is null
     */
    public static boolean isPalindrome(String s) {
        if (s == null) throw new IllegalArgumentException("Input must not be null");
        int left = 0;
        int right = s.length() - 1;
        while (left <= right) {
            while (!Character.isLetterOrDigit(s.charAt(left)) && left < right) left++;
            while (!Character.isLetterOrDigit(s.charAt(right)) && left < right) right--;
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    /**
     * Reverses the given string.
     *
     * @param s the string to be reversed; must not be null
     * @return the reversed string
     * @throws IllegalArgumentException if the input string is null
     */
    public static String reverse(String s) {
        if (s == null) throw new IllegalArgumentException("Input must not be null");
        StringBuilder reversedString = new StringBuilder(s).reverse();
        return reversedString.toString();
    }


    /**
     * Counts the number of vowels (a, e, i, o, u) in the given string.
     * The check is case-insensitive.
     *
     * @param s the input string to count vowels in; must not be null
     * @return the number of vowels found in the string
     * @throws IllegalArgumentException if the input string is null
     */
    public static int countVowels(String s) {
        if (s == null) throw new IllegalArgumentException("Input must not be null");
        int counter = 0;
        String vowelLetter = "aeiou";
        for (int i = 0; i < s.length(); i++) {
            if (vowelLetter.indexOf(Character.toLowerCase(s.charAt(i))) >= 0) {
                counter++;
            }
        }
        return counter;
    }

}
