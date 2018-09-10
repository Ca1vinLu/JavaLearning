package job;

import java.util.Scanner;

/**
 * 京东笔试题1
 */
public class JD1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long r, c, x, y, d;
        r = scanner.nextLong();
        c = scanner.nextLong();
        x = scanner.nextLong() - 1;
        y = scanner.nextLong() - 1;
        d = scanner.nextLong();
        int count = 0;

//        for (long i = 0; i < r; i++) {
////            for (long j = 0; j < c - i - 1; j++) {
////                if (Math.abs(i - x + 1) + Math.abs(j - y + 1) == d)
////                    count += 2;
////            }
////            if (Math.abs(i - x + 1) + Math.abs(c - i - y) == d)
////                count++;
////        }

        for (int i = 0; i <= d; i++) {

            if (isValid(r, c, x + i, y + d - i))
                count++;
            if (i != 0 && isValid(r, c, x - i, y + d - i))
                count++;
            if (i != d && isValid(r, c, x + i, y + i - d))
                count++;
            if (i != 0 && i != d && isValid(r, c, x - i, y + i - d))
                count++;

        }


        System.out.println(count);
    }

    private static boolean isValid(long r, long c, long x, long y) {
        return 0 <= x && x < r && 0 <= y && y < c;
    }
}
