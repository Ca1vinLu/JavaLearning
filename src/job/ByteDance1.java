package job;

import java.util.Scanner;

public class ByteDance1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        longestSubString(input);
    }

    private static void longestSubString(String input) {
        String sub = "";
        int maxLength = 0;
        int length = input.length();
        for (int i = 0; i < length; i++) {
            char c = input.charAt(i);
            if (sub.indexOf(c) == -1) {
                sub += c;
                if (maxLength < sub.length()) {
                    maxLength = sub.length();
                }
            } else {
                sub = String.valueOf(c);
            }
        }

        System.out.println(maxLength);
    }
}
