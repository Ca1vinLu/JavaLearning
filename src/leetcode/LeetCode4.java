package leetcode;

public class LeetCode4 {
    public static void main(String[] args) {

    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        int[] combinedArr = new int[length];
        int currentIndex = 0;
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                combinedArr[currentIndex++] = nums1[i++];
            } else {
                combinedArr[currentIndex++] = nums2[j++];
            }
        }
        if (i < nums1.length) {
            while (i < nums1.length) {
                combinedArr[currentIndex++] = nums1[i++];
            }
        } else if (j < nums2.length) {
            while (j < nums2.length) {
                combinedArr[currentIndex++] = nums2[j++];
            }
        }
        if (length % 2 == 1) {
            return combinedArr[length / 2];
        } else {
            return (combinedArr[length / 2] + combinedArr[length / 2 - 1]) / 2.0;
        }
    }
}
