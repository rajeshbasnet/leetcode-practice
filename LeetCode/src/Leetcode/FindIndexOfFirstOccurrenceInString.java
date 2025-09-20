package Leetcode;

public class FindIndexOfFirstOccurrenceInString {
    public static int strStr(String haystack, String needle) {
        if (!haystack.contains(needle)) {
            return -1;
        }

        int m = haystack.length();
        int n = needle.length();

        for (int i = 0; i <= (m - n); i++) {
            String substring = haystack.substring(i, (i+n));
            if (substring.equals(needle)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("codeleet", "leet"));
    }

    // codeleet - 8,
    // 4
}
