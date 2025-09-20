package Leetcode;

import java.time.Duration;
import java.time.LocalDateTime;


public class RomanToInteger {
    public static int romanToInt(String s) {
        LocalDateTime startDate = LocalDateTime.now();
        int output = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int current = 0;
            switch (String.valueOf(s.charAt(i))) {
                case "I":
                    current = 1;
                    break;
                case "V":
                    current = 5;
                    break;
                case "X":
                    current = 10;
                    break;
                case "L":
                    current = 50;
                    break;
                case "C":
                    current = 100;
                    break;
                case "D":
                    current = 500;
                    break;
                case "M":
                    current = 1000;
                    break;
            }

            if (current < prev) {
                output -= current;
            } else {
                output += current;
            }
            prev = current;
        }
        System.out.println(Duration.between(startDate, LocalDateTime.now()).toNanos());
        return output;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}
