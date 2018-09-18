package job;

import java.util.Scanner;

public class Tencent1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            long n = scanner.nextLong();
            int total = 0;
            long a = n;
            while (a != 0) {
                total += a % 10;
                a /= 10;
            }
            if (n % total == 0)
                System.out.println("Yes");
            else
                System.out.println("No");

        }
    }
}


/**
 * 7
 * 34
 * 66
 * 72
 * 6
 * 32
 * 33
 * 86
 */
