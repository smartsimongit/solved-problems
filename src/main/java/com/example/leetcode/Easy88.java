package com.example.leetcode;

public class Easy88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int rNums1 = m - 1;
        int rNums2 = n - 1;
        int pointerToEnd = nums1.length - 1;
        while (rNums2 >= 0) {
            if (rNums1 >= 0 && nums1[rNums1] >= nums2[rNums2]) {
                nums1[pointerToEnd] = nums1[rNums1];
                rNums1--;
                pointerToEnd--;
            } else {
                nums1[pointerToEnd] = nums2[rNums2];
                rNums2--;
            }

        }
    }

}
