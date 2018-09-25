package job;

import java.util.Scanner;

public class BaiCiZhan1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String time = scanner.nextLine();
        int[] a = new int[3];
        a[0] = Integer.parseInt(time.substring(0, 2));
        a[1] = Integer.parseInt(time.substring(3, 5));
        a[2] = Integer.parseInt(time.substring(6, 8));
        time = scanner.nextLine();
        int[] b = new int[3];
        b[0] = Integer.parseInt(time.substring(0, 2));
        b[1] = Integer.parseInt(time.substring(3, 5));
        b[2] = Integer.parseInt(time.substring(6, 8));

        double second = (b[0] - a[0]) * 3600 + (b[1] - a[1]) * 60 + (b[2] - a[2]);
        double sec = second * 6;
        second /= 60f;
        double min = second * 6;
        second /= 60f;
        double hour = second * 30;
        System.out.println(((long) hour));
        System.out.println(((long) min));
        System.out.println(((long) sec));
    }
}
