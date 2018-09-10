package leetcode;

/**
 * 字符串相乘（待优化）
 */
public class LeetCode43 {
    public static void main(String[] args) {
        System.out.println(multiply("123", "456"));
    }

    public static final int ZERO = '0';

    public static String multiply(String num1, String num2) {
        int length1 = num1.length();
        int length2 = num2.length();
        if (num1.equals("0") || num2.equals("0"))
            return "0";
        int[] result = new int[length1 + length2];
        for (int i = length2 - 1; i >= 0; i--) {
            int[] multiValue = new int[length1 + 1];
            int remainder = 0;
            for (int j = length1 - 1; j >= 0; j--) {
                int value = getRealValue(num1.charAt(j)) * getRealValue(num2.charAt(i)) + remainder;
                remainder = value / 10;
                multiValue[j + 1] = value % 10;
            }
            if (remainder != 0) {
                multiValue[0] = remainder;
            }

            remainder = 0;
            int index = result.length - 1 - (length2 - 1 - i);
            for (int k = 0; k < multiValue.length; k++, index--) {
                int value = result[index];
                value = value + multiValue[multiValue.length - k - 1] + remainder;
                remainder = value / 10;
                result[index] = value % 10;
            }

            while (remainder != 0) {
                int value = result[index];
                value = value + remainder;
                remainder = value / 10;
                result[index] = value % 10;
                index--;
            }


        }

        StringBuilder sb = new StringBuilder();
        if (result[0] != 0)
            sb.append(result[0]);
        for (int i = 1; i < result.length; i++) {
            sb.append(result[i]);
        }


        return sb.toString();
    }

    private static int getRealValue(char c) {
        return c - ZERO;
    }
}
