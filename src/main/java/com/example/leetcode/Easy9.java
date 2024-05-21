package com.example.leetcode;

public class Easy9 {
    public boolean isPalindrome(int x) {
        int temp = x;
        int nn = 0;
        if (x < 0) {
            return false;
        }

        while (temp != 0) {
            nn = nn * 10 + temp % 10;
            temp /= 10;
        }
        return nn == x;
    }

}
