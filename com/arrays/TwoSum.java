package com.arrays;

 import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // check if complement exists
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            // store current number with index
            map.put(nums[i], i);
        }

        return new int[]{}; // no solution
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println(result[0] + ", " + result[1]);
    }
}