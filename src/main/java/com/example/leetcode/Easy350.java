package com.example.leetcode;


import java.util.Arrays;

public class Easy350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int first = 0;
        int second = 0;
        int k = 0;

        while (first < nums1.length && second < nums2.length) {
            if (nums1[first] == nums2[second]) {
                nums1[k] = nums1[first];
                first++;
                second++;
                k++;
            } else if (nums1[first] > nums2[second]) {
                second++;
            } else {
                first++;
            }

        }
        return Arrays.copyOfRange(nums1, 0, k);
    }

}