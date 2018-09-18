package job;

import java.util.Arrays;
import java.util.Scanner;

public class IQiYi2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int p = scanner.nextInt() - 1;

        int[] food = new int[n];
        for (int i = 0; i < n; i++) {
            food[i] = scanner.nextInt();
        }
        for (int i = 0; i < m; i++) {
            String op = scanner.next();
            int index = scanner.nextInt() - 1;
            if (op.equals("A")) {
                food[index]++;
            } else if (op.equals("B")) {
                food[index]--;
            }
        }

        int remain = food[p];
        Arrays.sort(food);


        for (int i = n - 1; i >= 0; i--) {
            if (food[i] == remain) {
                System.out.println(n - i);
                break;
            }
        }
    }
}

/**
 * 3 4 2
 * 5 3 1
 * B 1
 * A 2
 * A 2
 * A 3
 */
