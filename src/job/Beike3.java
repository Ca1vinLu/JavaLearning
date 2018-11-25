package job;

import java.util.Scanner;
import java.util.Stack;

public class Beike3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.next();
        Stack<Character> op = new Stack<>();
        Stack<Long> value = new Stack<>();
        int start = 0, end = 0;
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '+' || c == '-') {
                char charAtStart = expression.charAt(start);
                int valueLength = end - start;
                if (valueLength > 1 && charAtStart == '0') {
                    if (expression.charAt(start + 1) == 'x') {
                        value.push(Long.parseLong(expression.substring(start + 2, end), 16));
                    } else {
                        value.push(Long.parseLong(expression.substring(start + 1, end), 8));
                    }
                } else {
                    value.push(Long.parseLong(expression.substring(start, end)));
                }

                start = end = i + 1;
                op.push(c);
            } else {
                end++;
            }
        }

        char charAtStart = expression.charAt(start);
        int valueLength = end - start;
        if (valueLength > 1 && charAtStart == '0') {
            if (expression.charAt(start + 1) == 'x') {
                value.push(Long.parseLong(expression.substring(start + 2, end), 16));
            } else {
                value.push(Long.parseLong(expression.substring(start + 1, end), 8));
            }
        } else {
            value.push(Long.parseLong(expression.substring(start, end)));
        }

        // 计算
        while (!op.empty()) {
            char operator = op.pop();
            if (operator == '+') {
                value.push(value.pop() + value.pop());
            } else {
                value.push(-value.pop() + value.pop());

            }
        }

        System.out.println(value.pop());
    }


}

/**
 * 027555+692-0xD32C
 */
