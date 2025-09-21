package Leetcode;

import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int len = digits.length;

        for(int i=len - 1; i >= 0; i--) {
            if(digits[i] < 9) {
                digits[i]++;  // 888 // 889  // 89 90 // 99 -> 100
                return digits;
            }

            digits[i] = 0;
        }

        int[] elseDigits = new int[len + 1];
        elseDigits[0] = 1; //since integer array default value will be 0 for all unset
        return elseDigits;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{9, 9})));;
    }

}
