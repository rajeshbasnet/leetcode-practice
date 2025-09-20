package Leetcode;

import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class MaximumNumberOfWordsYouCanType {
    public static int canBeTypedWords(String text, String brokenLetters) {
        Set<Character> characterSet = brokenLetters.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toSet());

        long output = Arrays.stream(text.split(" "))
                .filter(word -> word.chars().noneMatch(c -> characterSet.contains((char) c)))
                .count();

        return (int) output;
    }

    public static int canBeTypedWordsOptimized(String text, String brokenLetters) {
        boolean[] brokenChar = new boolean[26];
        for(char c : brokenLetters.toCharArray()) {
            brokenChar[c - 'a'] = true;
        }

        long output = Arrays.stream(text.split(" "))
                .filter(word -> word.chars().noneMatch(c -> brokenChar[(char) c - 'a']))
                .count();

        return (int) output;
    }

    public static void main(String[] args) {
        System.out.println(canBeTypedWordsOptimized("leet code", "lt"));
    }
}
