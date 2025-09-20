package Leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromSortedArray {
    public static HashSet<Integer> removeDuplicates(int[] nums) {
        return new HashSet<Integer>(Arrays.stream(nums).boxed().collect(Collectors.toList()));
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[] {1, 2, 3, 3, 3, 4, 5}));
    }
}
