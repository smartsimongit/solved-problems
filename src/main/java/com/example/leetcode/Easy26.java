package com.example.leetcode;

public class Easy26 {
    public static int removeDuplicates(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            }
            nums[count] = nums[i];
            count++;
        }
        return count;
    }

//    Best Way:
//
//    public int removeDuplicates(int[] nums) {
//        int i=1;
//        for(int j=1; j<nums.length; j++){
//            if(nums[j] != nums[j-1]){
//                nums[i] = nums[j];
//                i++;
//            }
//        }
//        return i;
//    }


    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 2, 3, 3, 4};
        int k = removeDuplicates(nums);
        System.out.println(k);
    }
}
