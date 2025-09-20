package Leetcode;

public class FindMedianSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLengthOfCombinedArr = nums1.length + nums2.length;
        int[] combined = new int[totalLengthOfCombinedArr];
        double result;

        System.arraycopy(nums1, 0, combined, 0, nums1.length);
        System.arraycopy(nums2, 0, combined, nums1.length, nums2.length);

        for(int i = 0; i < combined.length; i++) {
            for(int j = i + 1; j < combined.length; j++) {
                if(combined[i] > combined[j]) {
                    int temp = combined[i];
                    combined[i] = combined[j];
                    combined[j] = temp;
                }
            }
        }

        for(int i : combined) {
            System.out.println(i);
        }


        boolean isEven = totalLengthOfCombinedArr % 2 == 0;

        int midIndex = totalLengthOfCombinedArr / 2;  // 1.5 -> 1

        if(!isEven) {
            result = combined[midIndex];
        }else {
            int firstMidVal = combined[midIndex - 1];
            int secondMidVal = combined[midIndex];
            result = (double) (firstMidVal + secondMidVal) / 2;
        }

        return result;
    }

    public static double findMedianSortedArrays_1ms(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length) {
            findMedianSortedArrays_1ms(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;
        int left = 0;
        int right = m;

        while(left <= right) {
            int i = left + right / 2;
            int j = (m + n + 1) / 2 - 1;

            // nums1
            int maxLeft1 = (i == 0) ? Integer.MIN_VALUE : nums1[i - 1];
            int minRight1 = (i == m) ? Integer.MAX_VALUE : nums1[i];

            // nums2
            int maxLeft2 = (j == 0) ? Integer.MIN_VALUE : nums2[j -1 ];
            int minRight2 = (j == n) ? Integer.MAX_VALUE : nums2[j];

            if(maxLeft1 <= minRight1 && maxLeft2 <= minRight2) {
                if((m + n) % 2 == 0) {
                    return (double) (Math.max(maxLeft1, maxLeft2) + Math.min(minRight1, minRight2)) / 2;
                }else {
                    return Math.max(maxLeft1, maxLeft2);
                }
            }else if(maxLeft1 > minRight1) {
                right = i - 1;
            }else {
                left = i + 1;
            }
        }

        throw new IllegalArgumentException("Invalid input arrays");
    }

    public static void main(String[] args) {
        double result = findMedianSortedArrays_1ms(new int[] {1, 3}, new int[] {2});
        System.out.println(result);
    }
}
