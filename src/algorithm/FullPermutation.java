package algorithm;

import java.util.Arrays;

/**
 * 字符串全排列
 */
public class FullPermutation {
    private static int count = 0;

    public static void main(String[] args) {
        char[] str = {'a', 'b', 'c', 'd', 'a'};
        permutation(str, 0);
        System.out.println(count);
    }

    /**
     * 递归法
     *
     * @param str
     * @param start
     */
    private static void permutation(char[] str, int start) {
        if (start == str.length - 1) {
            System.out.println(Arrays.toString(str));
            count++;
            return;
        }
        for (int i = start; i < str.length; i++) {
            if (i == start || str[i] != str[start]) {
                swap(str, start, i);
                permutation(str, start + 1);
                swap(str, start, i);
            }
        }
    }

    private static void swap(char[] str, int i, int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
}
