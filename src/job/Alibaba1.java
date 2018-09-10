package job;

import java.util.Scanner;

/**
 * 问题：
 * 用火柴组成数字（如下图） 1需要2根火柴 2需要5根火柴 3需要5根火柴 4需要4根火柴 5需要5根火柴 6需要6根火柴 7需要3根火柴 8需要7根火柴 9需要6根火柴 使用m根火柴 组成n位数 火柴不能浪费 使组成的数数值最大 求这个最大的数值
 * 输入:
 * 输入数据包括2行
 * 第一行为火柴根数
 * 第二行为需要组成数的位数
 * 输出:
 * 组成的最大数
 * 输入范例:
 * 20
 * 7
 * 输出范例:
 * 9771111
 */
public class Alibaba1 {

/** 请完成下面这个函数，实现题目要求的功能 **/
    /**
     * 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^
     **/
    //火柴数
    private static final int[] tips = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};

    static String maxNum(int m, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 9; j >= 0; j--) {
                if ((m - tips[j] - 2 * (n - i - 1)) >= 0) {
                    result.append(j);
                    m = m - tips[j];
                    break;
                }
            }
        }
        return result.toString();
    }

    static boolean canUse(int number, int remainM, int remainN) {
        return remainM - tips[number] - 2 * (remainN - 1) >= 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String res;

        int _m;
        _m = Integer.parseInt(in.nextLine().trim());

        int _n;
        _n = Integer.parseInt(in.nextLine().trim());

        res = maxNum(_m, _n);
        System.out.println(res);
    }
}