package Leetcode;

public class ClimbingStairs {
    public static int climbStairs(int n) {
        if(n <= 2) return n;
        // recursive
        int ways = climbStairs(n - 1) + climbStairs(n - 2);
        return ways;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }
}
