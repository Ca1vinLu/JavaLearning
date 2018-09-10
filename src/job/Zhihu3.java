package job;

import java.util.Scanner;

public class Zhihu3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        int count = 0;
        while (n != 0) {
            if (n % 2 == 1)
                count++;
            n /= 2;
        }
        System.out.println(count);
    }
}
