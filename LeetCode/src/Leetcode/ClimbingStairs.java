package Leetcode;

public class ClimbingStairs {
    public static int climbStairsRecursive(int n) {
        if(n <= 2) return n;
        // recursive
        //We can store array value for all value less than n to do lookup next time from array
        return climbStairsRecursive(n - 1) + climbStairsRecursive(n - 2);
    }

    public static int climbStairs(int n) {
        if(n <= 2) return n;
        int lastOne = 1;
        int lastTwo = 2;

        for(int i = 3; i <= n; i++) {
            int current = lastOne + lastTwo;
            lastOne = lastTwo;
            lastTwo = current;
        }

        return lastTwo;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }
}
