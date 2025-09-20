package Leetcode;

import java.util.Arrays;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        return (Arrays.stream(s.split(" "))
                .map(String::trim)
                .filter(str -> !str.isEmpty())
                .peek(System.out::println)
                .reduce((_, second) -> second)
                .orElse("")).length();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }
}
