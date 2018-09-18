package leetcode;

/**
 * 反转整数
 */
public class LeetCode7 {

    public static void main(String[] args) {
        System.out.println(0xf);
        System.out.println(Integer.MAX_VALUE + 1);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(reverse(-2147483648));
    }

    public static int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int adder = x % 10;
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && adder > 7)
                    || result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && adder < -8)) {
                return 0;
            }
            result = result * 10 + adder;
            x /= 10;
        }
        return result;
    }
}
