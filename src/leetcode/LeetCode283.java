package leetcode;

import java.util.Arrays;

/**
 * 移动零
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 */
public class LeetCode283 {
    public static void main(String[] args) {
        int[] test = {0, 1, 0, 2, 12};
        System.out.println(Arrays.toString(test));
        moveZeroes(test);
        System.out.println(Arrays.toString(test));
    }

    public static void moveZeroes(int[] arr) {
        int notZeroNums = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int t = arr[i];
                arr[i] = 0;
                arr[notZeroNums++] = t;
            }
        }
    }
}
