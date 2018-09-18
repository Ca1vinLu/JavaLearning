package job;

import java.util.Arrays;
import java.util.Scanner;

public class IQiYi1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int[] arr = new int[6];
        for (int i = 5; i >= 0; i--) {
            arr[i] = value % 10;
            value /= 10;
        }
        Arrays.sort(arr, 0, 3);
        Arrays.sort(arr, 3, 6);

        int count = 0;
        int up = arr[0] + arr[1] + arr[2];
        int down = arr[3] + arr[4] + arr[5];
        if (up != down) {
            int addCount;
            int minusCount;
            int a = Math.abs(up - down);
            if (up > down) {
                addCount = getChangeCountByAdd(arr, 3, 6, a);
                minusCount = getChangeCountByMinus(arr, 0, 3, a);
            } else {
                addCount = getChangeCountByAdd(arr, 0, 3, a);
                minusCount = getChangeCountByMinus(arr, 3, 6, a);
            }
            count = Math.min(addCount, minusCount);

        }

        System.out.println(count);

    }

    private static int getChangeCountByAdd(int[] arr, int start, int end, int a) {
        int[] myArr = Arrays.copyOfRange(arr, start, end);
        int count = 0;
        for (int i = 0; i < 3; i++) {
            if (a == 0)
                break;
            if (9 - myArr[i] >= a) {
                myArr[i] += a;
                a = 0;
                count++;
            } else {
                a -= (9 - myArr[i]);
                myArr[i] = 9;
                count++;
            }
        }
        return count;
    }


    private static int getChangeCountByMinus(int[] arr, int start, int end, int a) {
        int[] myArr = Arrays.copyOfRange(arr, start, end);
        int count = 0;
        for (int i = 2; i >= 0; i--) {
            if (a == 0)
                break;
            if (myArr[i] >= a) {
                myArr[i] = 0;
                a = 0;
                count++;
            } else {
                a -= (myArr[i]);
                myArr[i] = 0;
                count++;
            }
        }
        return count;
    }


}
