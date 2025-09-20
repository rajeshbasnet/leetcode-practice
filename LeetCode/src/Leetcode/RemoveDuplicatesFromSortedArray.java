package Leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        // 0, 1, 2, 2, 3  // i=0, j=1
        // 0, 1, 2, 2, 3
        // i = 1, j= 2
        // 0, 1, 2, 2, 3
        //i = 2, j=3
        // i=2, j = 3
        // 0, 1, 2, 3, 3
        // count - i + 1
        if(nums.length == 0) return 0;

        int i = 0;
        for(int j=1; j<nums.length; j++) {
            if(nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[] {1, 2, 3, 3, 3, 4, 5}));
    }
}
