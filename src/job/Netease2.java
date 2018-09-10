package job;

import java.util.Scanner;

public class Netease2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length;
        length = scanner.nextInt();
        long n, m;
        while (length-- != 0) {
            n = scanner.nextLong();
            m = scanner.nextLong();
            if (n > m) {
                long temp = n;
                n = m;
                m = temp;
            }
            long count = 0;
            if (n == 1 && m == 1) {
                count = 1;
            } else if (n == 1 && m >= 2) {
                count = m - 2;
            } else if (n >= 2 && m >= 2) {
                count = (n - 2) * (m - 2);
            }

            System.out.println(count);
        }
    }


}
