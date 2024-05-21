package com.example.leetcode;

public class Easy125 {
    public boolean isPalindrome(String s) {
        if (s.length() == 0) {
            return true;
        }

        String palindrome = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                palindrome += s.charAt(i);
            }
        }
        palindrome = palindrome.toLowerCase();
        int begin = 0, end = palindrome.length() - 1;
        while (begin < end) {
            if (palindrome.charAt(begin) != palindrome.charAt(end)) {
                return false;
            }
            end--;
            begin++;

        }
        return true;
    }

//          Faster way:
//        public boolean isPalindrome(String s) {
//            int start = 0, end = s.length() - 1;
//            while(start < end) {
//                char sChar = s.charAt(start);
//                char eChar = s.charAt(end);
//                if(!(sChar >= 'A' && sChar <= 'Z') && !(sChar >= 'a' && sChar <= 'z') && !(sChar >= '0' && sChar <= '9')) {
//                    start++;
//                    continue;
//                }
//                if(!(eChar >= 'A' && eChar <= 'Z') && !(eChar >= 'a' && eChar <= 'z') && !(eChar >= '0' && eChar <= '9')) {
//                    end--;
//                    continue;
//                }
//                if(sChar >= 'A' && sChar <= 'Z') {
//                    sChar += (char)32;
//                }
//                if(eChar >= 'A' && eChar <= 'Z') {
//                    eChar += (char)32;
//                }
//                if(sChar != eChar) {
//                    return false;
//                }
//                start++;
//                end--;
//            }
//            return true;
//        }






}
