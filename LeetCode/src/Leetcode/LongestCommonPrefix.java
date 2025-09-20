package Leetcode;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        int minLength = Integer.MAX_VALUE;

        for (String s : strs) {
            minLength = Math.min(minLength, s.length());
        }

        int low = 0;
        int high = minLength;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isCommonPrefix(strs, mid)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return strs[0].substring(0, high);
    }

    public static boolean isCommonPrefix(String[] strs, int len) {
        String prefix = strs[0].substring(0, len);
        return Arrays.stream(strs)
                .allMatch(s -> s.startsWith(prefix));
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[] {"flower","flow","flight"}));
    }
}
