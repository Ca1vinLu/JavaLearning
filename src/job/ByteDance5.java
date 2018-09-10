package job;

import java.util.Scanner;

public class ByteDance5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m;
        n = scanner.nextInt();
        if (n == 0) {
            System.out.println(0);
            return;
        } else if (n == 1) {
            System.out.println(1);
            return;
        }

        m = scanner.nextInt();
        int[][] pars = new int[m][2];
        for (int i = 0; i < m; i++) {
            pars[i][0] = scanner.nextInt();
            pars[i][1] = scanner.nextInt();
        }
    }
}
