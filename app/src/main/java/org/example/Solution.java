package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public static boolean isPalindrome(int x) {
        List<Integer> digits = new ArrayList<>();
        while (x > 0) {
            digits.add(x % 10);
            x = x / 10;
        }
        List<Integer> original = new ArrayList<>(digits);
        Collections.reverse(digits);
        return original.equals(digits);
    }
}
