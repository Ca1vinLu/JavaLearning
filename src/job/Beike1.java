package job;

import java.util.Scanner;

public class Beike1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m;
        n = scanner.nextInt();
        m = scanner.nextInt();
        int[] a = new int[n];
        a[n - 1] = m;
        for (int i = 0; i < n - 1; i++) {
            a[i] = 1;
        }
        int count = 0;
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < m - 1; j++) {
                boolean isCondition = true;
                for (int k = 0; k < n - 1; k++) {
                    if (a[k + 1] % a[k] != 0) {
                        isCondition = false;
                        break;
                    }
                }
                if (isCondition)
                    count++;
                a[i]++;
            }
        }

        boolean isCondition = true;
        for (int k = 0; k < n - 1; k++) {
            if (a[k + 1] % a[k] != 0) {
                isCondition = false;
                break;
            }
        }
        if (isCondition)
            count++;

        System.out.println(count % 1000000007);

    }


}
