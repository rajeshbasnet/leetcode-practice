package Leetcode;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        //1, 2, 3, 5, 6 - 4
        int low = 0;
        int high = nums.length - 1;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(nums[mid] == target) {
                return mid;
            }else if(nums[mid] < target) {
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[] {1, 2, 3, 5, 6}, 4));
    }
}
