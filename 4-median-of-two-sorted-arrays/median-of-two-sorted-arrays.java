import java.util.*;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] total = new int[nums1.length + nums2.length];

        for (int i = 0; i < nums1.length; i++) {
            total[i] = nums1[i];
        }

        for (int j = 0; j < nums2.length; j++) {
            total[nums1.length + j] = nums2[j];
        }

        Arrays.sort(total);

        int n = total.length;

        if (n % 2 == 1) {
            return total[n / 2];
        }

        return (total[n / 2 - 1] + total[n / 2]) / 2.0;
    }
}
