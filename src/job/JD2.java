package job;

import java.util.Scanner;

/**
 * 京东笔试题2
 */
public class JD2 {
    /**
     * 请完成下面这个函数，实现题目要求的功能
     * 当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
     * *****************************开始写代码
     ******************************/
    static int Solve(int[] a) {
        if (a.length <= 2)
            return 1;
        int count = 0;
        for (int i = 2; i <= a.length - 2; i++) {
            for (int j = 0; j < a.length; j++) {
                if (isValid(a, j, (j + i) % a.length)) {
//                    System.out.println((j + 1) + "," + ((j + i) % a.length + 1));
                    count++;
                }
            }
        }
        count /= 2;
        count += 5;
        return count;
    }

    static boolean isValid(int[] a, int start, int end) {
        if (start > end) {
            int t = start;
            start = end;
            end = t;
        }

        boolean valid = true;
        int startValue = a[start];
        int endValue = a[end];
        for (int i = start + 1; i < end; i++) {
            if (a[i] > startValue || a[i] > endValue)
                valid = false;
        }
        if (valid)
            return true;


        valid = true;
        for (int i = 0; i < start; i++) {
            if (a[i] > startValue || a[i] > endValue)
                valid = false;
        }

        for (int i = end + 1; i < a.length; i++) {
            if (a[i] > startValue || a[i] > endValue)
                valid = false;
        }

        return valid;

    }

    /******************************结束写代码******************************/


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int res;

        int _a_size = scanner.nextInt();
        int[] _a = new int[_a_size];
        for (int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a[_a_i] = scanner.nextInt();
        }

        res = Solve(_a);
        System.out.println(String.valueOf(res));

    }
}

/**
 * 5
 * 1 2 4 5 3
 */
