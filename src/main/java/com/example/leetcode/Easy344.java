package com.example.leetcode;

public class Easy344 {
    public void reverseString(char[] s) {
        int l = 0;
        int r = s.length-1;

        while (r>l) {
            char letter = s[l];
            s[l] = s[r];
            s[r] = letter;

            l++;
            r++;
        }
    }
}
