package Leetcode;

public class Sqrt {
    public static int mySquareRoot(int x) {
        int low = 0;
        int high = x;
        int answer = 0;

        while(low <= high) {
            int mid = low + (high - low) / 2; // 0 - 9 // 4.5 // 4// 4 * 4 == 16 // 2 * 2 = 4
            int mValue = mid * mid;

            if(mValue == x) {

                return mid;
            }else if(mValue < x) {
                answer = mid;
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(mySquareRoot(8));
    }
}
