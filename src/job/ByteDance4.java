package job;

import java.util.Scanner;

public class ByteDance4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <= 0 || n > 4) {
            System.out.println(0);
            return;
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int t = scanner.nextInt();
            t = t & 0xff;
            arr[i] = t;
        }
        boolean legal;
        if (n == 1) {

            legal = arr[0] >> 7 == 0;
        } else if (n == 2) {
            legal = arr[0] >> 5 == 6 && arr[1] >> 6 == 2;
        } else if (n == 3) {
            legal = arr[0] >> 4 == 14 && arr[1] >> 6 == 2 && arr[2] >> 6 == 2;
        } else {
            legal = arr[0] >> 3 == 30 && arr[1] >> 6 == 2 && arr[2] >> 6 == 2 && arr[3] >> 6 == 2;
        }

        System.out.println(legal ? 1 : 0);
    }
}

/**
 * 2
 * 197 130
 * <p>
 * 3
 * 235 140 44
 */
