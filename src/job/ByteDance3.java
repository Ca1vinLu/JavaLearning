package job;

import java.util.Scanner;

public class ByteDance3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(getIpCount(input, 1));

    }

    private static int getIpCount(String input, int remainAddress) {
        if (input.isEmpty() || remainAddress == 0 || input.length() < remainAddress || remainAddress * 3 > input.length())
            return 0;
        if (remainAddress == input.length())
            return 1;

        if (input.charAt(0) == '0' && input.length() > 1)
            return getIpCount(input.substring(1), remainAddress - 1);

        int length = Math.min(3, input.length());
        int count = 1;

        for (int i = 0; i < length; i++) {
            String substring = input.substring(0, i + 1);
            int value = Integer.valueOf(substring);
            if (value >= 0 && value < 256 && i + 1 < input.length()) {
                count += getIpCount(input.substring(i + 1), remainAddress - 1);
            }
        }
        return count;
    }
}
