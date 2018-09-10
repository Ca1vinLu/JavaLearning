package job;

import java.util.Scanner;

public class Zhihu1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <= 1) {
            System.out.println(n);
            return;
        }
        int[] arr = new int[n];
        int maxLength = 1;
        int start = 0, end = 0;
        arr[0] = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] > arr[end]) {
                end = i;
            } else {
                if (maxLength < end - start + 1) {
                    maxLength = end - start + 1;
                }
                start = end = i;
            }
        }
        if (maxLength < end - start + 1) {
            maxLength = end - start + 1;
        }

        System.out.println(maxLength);
    }
}
